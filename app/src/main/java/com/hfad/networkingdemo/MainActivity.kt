package com.hfad.networkingdemo
// Dylan Bellinger and Steven Griffin
// Assignment 3
// 4/6/2023
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.materialToolbar))
        val navController = findNavController(R.id.nav_host_fragment)
        val config = AppBarConfiguration(navController.graph)
        findViewById<Toolbar>(R.id.materialToolbar).setupWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
}