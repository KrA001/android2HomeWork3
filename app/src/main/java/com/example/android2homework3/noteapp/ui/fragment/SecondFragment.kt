package com.example.android2homework3.noteapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android2homework3.databinding.FragmentSecondBinding
import com.example.android2homework3.R
import com.example.utils.PreferencesHelper

class SecondFragment : Fragment(R.layout.fragment_second) {

    private var _binding: FragmentSecondBinding? = null
    private val binding: FragmentSecondBinding get() = _binding!!
    private val preferencesHelper: PreferencesHelper by lazy {
        PreferencesHelper(context ?: requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onSkipClick()
    }

    private fun onSkipClick() {
        binding.btnScip.setOnClickListener {
            preferencesHelper.isShownOnBoard = true
            findNavController().navigate(R.id.action_boardFragment_to_homeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}