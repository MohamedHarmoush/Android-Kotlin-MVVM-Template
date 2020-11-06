package com.harmoush.photoweather.ui

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.harmoush.photoweather.R
import com.harmoush.photoweather.databinding.ActivityMainBinding
import com.harmoush.photoweather.utils.snakeBar
import com.phelat.navigationresult.FragmentResultActivity

class MainActivity : FragmentResultActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupActionBar(binding)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            view.snakeBar("Replace with your own action")
        }
    }

    override fun getNavHostFragmentId(): Int {
        return R.id.nav_host_fragment
    }

    override fun onSupportNavigateUp(): Boolean {
        return getNavController().navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun setupActionBar(binding: ActivityMainBinding) {
        setSupportActionBar(binding.toolbar)
        val navController = getNavController()
        appBarConfiguration = AppBarConfiguration(navController.graph)
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    private fun getNavController(): NavController {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        return navHostFragment.navController
    }
}