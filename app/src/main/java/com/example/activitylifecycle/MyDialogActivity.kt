package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.activitylifecycle.databinding.ActivityMyDialogBinding

class MyDialogActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMyDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("DemoL :: DialogAct", "onCreate() called")
        setFinishOnTouchOutside(true)
        binding.btnSubmit.setOnClickListener{
            finish()
        }

    }
    override fun onRestart() {
        super.onRestart()
        Log.d("DemoL :: DialogAct", "onRestart() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("DemoL :: DialogAct", "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DemoL :: DialogAct", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DemoL :: DialogAct", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DemoL :: DialogAct", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DemoL :: DialogAct", "onDestroy() called")
    }

}