package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylifecycle.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("DemoL :: MainAct2", "onCreate() called")
        binding.favBtn.setOnClickListener {
            var i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }

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