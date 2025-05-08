package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylifecycle.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("DemoL :: MainAct2", "onCreate() called")
        binding.btnNext.setOnClickListener {
            var i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }
        binding.btnBack.setOnClickListener {
           finish()
        }

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("DemoL :: MainAct2", "onRestart() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("DemoL :: MainAct2", "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DemoL :: MainAct2", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DemoL :: MainAct2", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DemoL :: MainAct2", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DemoL :: MainAct2", "onDestroy() called")
    }
}