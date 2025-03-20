package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("DemoL :: MainAct", "onCreate() called")

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
            var i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
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
            .setNegativeButton("Cancel") { _, _ ->
                Log.d(
                    "DialogLifecycle",
                    "Dialog Cancel Clicked"
                )
            }
            .create()
        Log.d("DialogLifecycle", "onCreate - Dialog Created")
        dialog.show()
    }
}