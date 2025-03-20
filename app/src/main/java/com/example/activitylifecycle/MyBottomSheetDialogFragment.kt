package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheetDialogFragment : BottomSheetDialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("DemoL :: BottomSheet", "onCreate - Bottom Sheet Created")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("DemoL :: BottomSheet", "onCreateView - Creating View")
        return inflater.inflate(R.layout.fragment_my_bottom_sheet_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<Button>(R.id.btn_close)
        btn.setOnClickListener {
            dismiss()
        }
        Log.d("DemoL :: BottomSheet", "onViewCreated - View Created")
    }

    override fun onStart() {
        super.onStart()
        Log.d("DemoL :: BottomSheet", "onStart - Bottom Sheet Shown")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DemoL :: BottomSheet", "onResume - Bottom Sheet Active")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DemoL :: BottomSheet", "onPause - Bottom Sheet Paused")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("DemoL :: BottomSheet", "onDestroyView - View Destroyed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DemoL :: BottomSheet", "onDestroy - Bottom Sheet Destroyed")
    }
}