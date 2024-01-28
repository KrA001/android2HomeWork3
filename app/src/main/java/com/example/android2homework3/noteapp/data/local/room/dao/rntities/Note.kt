package com.example.android2homework3.noteapp.data.local.room.dao.rntities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    val title: String,
    val description: String,
    val date: Date
)