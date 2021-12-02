package com.example.bookgallery.util

import android.text.format.DateFormat
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatterBuilder
import java.util.*
import java.util.regex.Pattern

class DateConverter {

    fun convertLongToTime(time: String): String {
        val date = Date(time.toLong()*1000L)
        val format = SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa")
        return format.format(date)
    }

    fun currentTimeToLong(): Long {
        return System.currentTimeMillis()
    }

    fun convertDateToLong(date: String): Long {
        val df = SimpleDateFormat("yyyy.MM.dd HH:mm")
        return df.parse(date).time
    }
}




