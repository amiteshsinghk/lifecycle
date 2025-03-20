package com.example.activitylifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.activitylifecycle.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onAttach(context: Context) {
        Log.d("DemoL :: SecondFrag", "onAttach called")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("DemoL :: SecondFrag", "onCreate called")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("DemoL :: SecondFrag", "onCreateView called")
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("DemoL :: SecondFrag", "onViewCreated called")
        binding.buttonSecond.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Handle the back button event
                // For example, navigate back to FragmentA
                parentFragmentManager.popBackStack()
            }
        }

        // Add the callback to the OnBackPressedDispatcher
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d("DemoL :: SecondFrag", "onViewStateRestored called")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.d("DemoL :: SecondFrag", "onStart called")
        super.onStart()
    }

    override fun onResume() {
        Log.d("DemoL :: SecondFrag", "onResume called")
        super.onResume()
    }

    override fun onPause() {
        Log.d("DemoL :: SecondFrag", "onPause called")
        super.onPause()
    }
    override fun onStop() {
        Log.d("DemoL :: SecondFrag", "onStop called")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("DemoL :: SecondFrag", "onSaveInstanceState called")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.d("DemoL :: SecondFrag", "onDestroyView called")
        super.onDestroyView()
        _binding = null
    }

    override fun onDestroy() {
        Log.d("DemoL :: SecondFrag", "onDestroy called")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("DemoL :: SecondFrag", "onDetach called")
        super.onDetach()
    }


}