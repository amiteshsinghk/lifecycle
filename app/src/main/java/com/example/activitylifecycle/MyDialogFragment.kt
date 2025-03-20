package com.example.activitylifecycle

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import com.example.activitylifecycle.databinding.FragmentMyDialogBinding


class MyDialogFragment  : DialogFragment() {

    var binding : FragmentMyDialogBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("DemoL :: DialogFrag", "onCreate - Dialog Created")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("DemoL :: DialogFrag", "onCreateView - Dialog Shown")
        binding = FragmentMyDialogBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        Log.d("DemoL :: DialogFrag", "onCreateDialog - Dialog Shown")
        val dialog = Dialog(requireActivity())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        dialog.setContentView(binding)
        dialog.window?.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(),
            R.color.black_88))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        return dialog
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnClose?.setOnClickListener {
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("DemoL :: DialogFrag", "onStart - Dialog Shown")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DemoL :: DialogFrag", "onResume - Dialog Active")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DemoL :: DialogFrag", "onPause - Dialog Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DemoL :: DialogFrag", "onStop - Dialog Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DemoL :: DialogFrag", "onDestroy - Dialog Destroyed")
    }
}