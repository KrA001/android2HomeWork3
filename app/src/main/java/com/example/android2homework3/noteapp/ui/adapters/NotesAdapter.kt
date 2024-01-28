package com.example.android2homework3.noteapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android2homework3.databinding.ItemPanelBinding
import com.example.android2homework3.noteapp.data.local.room.dao.rntities.Note

class NotesAdapter(
    private val noteList: List<Note>
) : RecyclerView.Adapter<NotesAdapter.NoteViewHolder>() {

    inner class NoteViewHolder(private val binding: ItemPanelBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(note: Note) = with(binding) {
            tvHave.text = note.title
            tvWork.text = note.description
            tvDataTime.text = note.date.time.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val binding = ItemPanelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.onBind(noteList[position])
    }

    override fun getItemCount() = noteList.size
}