package com.example.android2homework3.noteapp.data.local.room.converters

import androidx.room.TypeConverter
import java.util.Date

class DateConverters {
    @TypeConverter
    fun fromDate(value: Long?): Date?{
        return value?.let { Date(it) }
    }
    @TypeConverter
    fun toDate(date:Date): Long{
        return date.time
    }
}