package com.example.android2homework3.noteapp.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android2homework3.noteapp.ui.fragment.BoardFragment
import com.example.android2homework3.noteapp.ui.fragment.FirstFragment
import com.example.android2homework3.noteapp.ui.fragment.SecondFragment
import com.example.android2homework3.noteapp.ui.fragment.ThirdFragment

class RacersAdapter(fragment: BoardFragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }
    }
}