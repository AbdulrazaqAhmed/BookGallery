package com.example.bookgallery.util

import android.text.format.DateFormat
import androidx.room.TypeConverter
import com.bumptech.glide.disklrucache.DiskLruCache
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DateConverter {

            // need to convert date format here :


////    fun fromTimestamp(value: Long?): Date? {
////        return value?.let { Date(it) }
////
////        var date = DateFormat.format("dd-MM-yyyy").toString()
////        return date
////    }
//
//    fun FromTimestamp(value: Long?): Date? {
//        return DiskLruCache.Value("E, dd MMM yyyy", calendar).toString()
//    }
//
//    // convert timestamp to date sunday, aug, 21
////    @TypeConverter
////    fun dateToTimestamp(date: Date?): Long? {
////        return date?.time
//    }

    //convert date from long to date
    @TypeConverter
fun getDate(ts:Long?):String{
    if(ts == null) return ""
    //Get instance of calendar
    val calendar = Calendar.getInstance(Locale.getDefault())
    //get current date from ts 'time stamp'
    calendar.timeInMillis = ts
    //return formatted date
    return DateFormat.format(" dd MMM yyyy", calendar).toString()
}

}