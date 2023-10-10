package com.kevin.androidactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kevin.androidactivitylifecycle.databinding.ActivityFragmentCommunicationDemoBinding
import com.kevin.androidactivitylifecycle.fragments.BrowserFragment
import com.kevin.androidactivitylifecycle.fragments.ButtonsFragment

class FragmentCommunicationDemo : AppCompatActivity(), Communicator {

    private val binding by lazy { ActivityFragmentCommunicationDemoBinding.inflate(layoutInflater) }

    private val browserFragment by lazy { BrowserFragment() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {

        supportFragmentManager.beginTransaction()
            .replace(R.id.buttons, ButtonsFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.browser, browserFragment)
            .commit()
    }

    override fun sendMessage(message: String) {
        browserFragment.loadWebSite(message)
    }
}