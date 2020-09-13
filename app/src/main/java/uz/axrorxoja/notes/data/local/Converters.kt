package uz.axrorxoja.notes.data.local

import androidx.room.TypeConverter
import java.util.*


class Converters {
    @TypeConverter
    fun fromDateToTimeStamp(date: Date) = date.time

    @TypeConverter
    fun fromTimeStampToDate(time: Long) = Date(time)
}