package com.kevin.androidactivitylifecycle.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kevin.androidactivitylifecycle.Communicator
import com.kevin.androidactivitylifecycle.R
import com.kevin.androidactivitylifecycle.databinding.ActivityFragmentCommunicationDemoBinding
import com.kevin.androidactivitylifecycle.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {

    private lateinit var communicator: Communicator

    private lateinit var binding: FragmentButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        communicator = context as Communicator
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.google.setOnClickListener {
            communicator.sendMessage("https://www.google.com")
        }

        binding.facebook.setOnClickListener {
            communicator.sendMessage("https://www.facebook.com")
        }

        binding.youtube.setOnClickListener {
            communicator.sendMessage("https://www.youtube.com")
        }


    }


}