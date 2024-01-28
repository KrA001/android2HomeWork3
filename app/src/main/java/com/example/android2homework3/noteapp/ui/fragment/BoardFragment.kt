package com.example.android2homework3.noteapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android2homework3.R
import com.example.android2homework3.noteapp.ui.adapters.RacersAdapter
import com.example.android2homework3.databinding.FragmentBoardBinding

class BoardFragment : Fragment(R.layout.fragment_board) {

    private var _binding:FragmentBoardBinding? = null
    private val binding:FragmentBoardBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = RacersAdapter(this)
        binding.dotsIndicator.attachTo(binding.viewPager)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}