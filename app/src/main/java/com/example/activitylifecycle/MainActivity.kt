package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import com.example.activitylifecycle.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    var counter = 0
    private var isPaused = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("DemoL :: MainAct", "onCreate() called")
//        setSupportActionBar(binding.toolbar)
//
//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.btnFragment.setOnClickListener {
            var i = Intent(this, ActivityFragment::class.java)
            startActivity(i)
        }

        binding.btnDialogBottomSheet.setOnClickListener {
            val bottomSheet = MyBottomSheetDialogFragment()
            bottomSheet.show(supportFragmentManager, "MyBottomSheet")
        }

        binding.btnDialog.setOnClickListener {
            showSimpleDialog()
        }

        binding.btnDialogFragment.setOnClickListener {
            val dialog = MyDialogFragment()
            dialog.show(supportFragmentManager, "MyDialog")
        }



        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null)
//                .setAnchorView(R.id.fab).show()
            var i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    override fun onStart() {
        super.onStart()
        Log.d("DemoL :: MainAct", "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DemoL :: MainAct", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DemoL :: MainAct", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DemoL :: MainAct", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DemoL :: MainAct", "onDestroy() called")
    }

    private fun showSimpleDialog() {
        val dialog = AlertDialog.Builder(this)
            .setTitle("Simple Dialog")
            .setMessage("This is a simple dialog")
            .setPositiveButton("OK") { _, _ -> Log.d("DialogLifecycle", "Dialog OK Clicked") }
            .setNegativeButton("Cancel") { _, _ -> Log.d("DialogLifecycle", "Dialog Cancel Clicked") }
            .create()
        Log.d("DialogLifecycle", "onCreate - Dialog Created")
        dialog.show()
    }
}