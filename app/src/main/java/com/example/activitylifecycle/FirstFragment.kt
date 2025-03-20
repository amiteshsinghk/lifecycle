package com.example.activitylifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.activitylifecycle.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("DemoL :: FirstFrag", "onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("DemoL ::  FirstFrag", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        Log.d("DemoL :: FirstFrag", "onCreateView called")
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("DemoL :: FirstFrag", "onViewCreated called")
        binding.buttonFirst.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SecondFragment())
                .addToBackStack("SecondFragment")
                .commit()
        }
        binding.btnDialogBottomSheet.setOnClickListener {
            val bottomSheet = MyBottomSheetDialogFragment()
            bottomSheet.show(parentFragmentManager, "MyBottomSheet")
        }

        binding.btnDialog.setOnClickListener {
            showSimpleDialog()
        }

        binding.btnDialogFragment.setOnClickListener {
            val dialog = MyDialogFragment()
            dialog.show(parentFragmentManager, "MyDialog")
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("DemoL :: FirstFrag", "onViewStateRestored called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("DemoL :: FirstFrag", "onStart called")
    }

    override fun onResume() {
        Log.d("DemoL :: FirstFrag", "onResume called")
        super.onResume()
    }

    override fun onPause() {
        Log.d("DemoL :: FirstFrag", "onPause called")
        super.onPause()
    }

    override fun onStop() {
        Log.d("DemoL :: FirstFrag", "onStop called")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("DemoL :: FirstFrag", "onSaveInstanceState called")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.d("DemoL :: FirstFrag", "onDestroyView called")
        super.onDestroyView()
        _binding = null
    }

    override fun onDestroy() {
        Log.d("DemoL :: FirstFrag", "onDestroy called")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("DemoL :: FirstFrag", "onDetach called")
        super.onDetach()
    }

    private fun showSimpleDialog() {
        val dialog = AlertDialog.Builder(requireContext())
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