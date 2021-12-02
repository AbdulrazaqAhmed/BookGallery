package com.example.bookgallery.util

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DateConverterTest {
    private lateinit var dateConverter : DateConverter
    @Before
        fun setup(){
                dateConverter = DateConverter()
               // dateConverter = DateConverter()
        }
    //returns valid date
        @Test
     fun dateFormatIsValidwithvalidFormatThenReturnFalse(){

            val date = dateConverter.convertLongToTime("1638439065")
            Assert.assertEquals("2021.December.02 AD 12:57 PM", date)
    }

    //returns invalid date and throw exception
    @Test
    fun dateFormatIsValidwithInvalidFormatThenReturnExeption(){

        Assert.assertThrows(Exception::class.java , {
      dateConverter.convertLongToTime("xfhfghfgh")

        })
    }

//        @Test
//        fun dateFormatIsValidWithValidFormatThenReturnTrue(){
//
//        }

//


}