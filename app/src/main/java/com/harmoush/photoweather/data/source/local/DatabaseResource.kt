package com.harmoush.photoweather.data.source.local

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.voctag.android.model.Resource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * A generic class that can provide a resource backed by the sqlite database.
 *
 *
 * @param <ResultType>
</ResultType> */
abstract class DatabaseResource<ResultType>(private val scope: CoroutineScope) {

    private val result = MediatorLiveData<Resource<ResultType>>()

    init {
        result.value = Resource.loading(null)
        scope.launch(Dispatchers.IO) {
            val dbSource = performDbOperation()
            scope.launch(Dispatchers.Main) {
                result.addSource(dbSource) { data ->
                    result.removeSource(dbSource)
                    result.addSource(dbSource) { newData ->
                        setValue(Resource.success(newData))
                    }
                }
            }
        }
    }

    private fun setValue(newValue: Resource<ResultType>) {
        if (result.value != newValue) {
            result.value = newValue
        }
    }

    fun asLiveData() = result as LiveData<Resource<ResultType>>

    protected abstract fun performDbOperation(): LiveData<ResultType>
}
