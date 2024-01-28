package com.example.android2homework3.noteapp.ui.fragment.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android2homework3.databinding.FragmentAddNoteBinding
import com.example.android2homework3.noteapp.data.local.room.dao.rntities.Note
import com.example.utils.App
import java.util.Calendar

class AddNoteFragment : Fragment() {

    private var _binding: FragmentAddNoteBinding? = null
    private val binding: FragmentAddNoteBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addNoteRoom()
    }

    private fun addNoteRoom() = with(binding) {
        btnTwo.setOnClickListener {
            val title = etNeedTo.text.toString().trim()
            val description = etNeed.text.toString().trim()
            val data = Calendar.getInstance().time

            val note = Note(
                title = title,
                description = description,
                date = data
            )

            App.db.noteDao().addNote(note)
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}