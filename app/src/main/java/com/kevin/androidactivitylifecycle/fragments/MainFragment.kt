package com.kevin.androidactivitylifecycle.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kevin.androidactivitylifecycle.R


class MainFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "MainFragment onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "MainFragment onCreateView called")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "MainFragment onViewCreated called")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainFragment onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainFragment onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainFragment onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainFragment onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "MainFragment onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainFragment onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "MainFragment onDetach called")
    }

    companion object {
        private const val TAG = "Tag: MainFragment"
    }

}