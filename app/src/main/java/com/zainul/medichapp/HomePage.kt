package com.zainul.medichapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zainul.medichapp.databinding.ActivityHomePageBinding



class HomePage : Fragment(R.layout.activity_home_page) {
    private var _binding: ActivityHomePageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = ActivityHomePageBinding.inflate(inflater, container, false)
        return binding.root
    }
}