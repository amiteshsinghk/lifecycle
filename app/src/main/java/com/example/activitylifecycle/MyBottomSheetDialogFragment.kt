package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MyBottomSheetDialogFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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