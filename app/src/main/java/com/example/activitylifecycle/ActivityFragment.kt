package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.activitylifecycle.databinding.ActivityFragmentBinding

class ActivityFragment : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("DemoL :: ActFrag", "onCreate() called")
        binding = ActivityFragmentBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnBack.setOnClickListener{
            finish()
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FirstFragment())
            .addToBackStack("FirstFragment")
            .commit()

    }


    override fun onStart() {
        super.onStart()
        Log.d("DemoL :: ActFrag", "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DemoL :: ActFrag", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DemoL :: ActFrag", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DemoL :: ActFrag", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DemoL :: MainAct", "onDestroy() called")
    }
}