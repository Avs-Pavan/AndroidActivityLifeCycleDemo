package com.kevin.androidactivitylifecycle.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kevin.androidactivitylifecycle.Communicator
import com.kevin.androidactivitylifecycle.R
import com.kevin.androidactivitylifecycle.databinding.FragmentBrowserBinding

class BrowserFragment : Fragment() {


    private lateinit var binding: FragmentBrowserBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentBrowserBinding.inflate(inflater, container, false)

        return binding.root
    }



    fun loadWebSite(url: String) {
        binding.webview.loadUrl(url)
        binding.webview.settings.javaScriptEnabled = true
    }
}