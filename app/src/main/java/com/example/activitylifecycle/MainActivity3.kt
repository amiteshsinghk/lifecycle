package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylifecycle.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    var binding: ActivityMain3Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain3Binding.inflate(layoutInflater)
        Log.d("DemoL :: MainAct3", "onCreate() called")
        binding?.btnActivity3?.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("DemoL :: MainAct3", "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DemoL :: MainAct3", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DemoL :: MainAct3", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DemoL :: MainAct3", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DemoL :: MainAct3", "onDestroy() called")
    }
}