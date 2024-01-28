package com.example.android2homework3

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.android2homework3.noteapp.data.local.room.converters.DateConverters
import com.example.android2homework3.noteapp.data.local.room.dao.NoteDao
import com.example.android2homework3.noteapp.data.local.room.dao.rntities.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao

}