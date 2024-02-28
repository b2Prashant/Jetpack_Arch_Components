package com.b2prashant.jetpackarchitecturecomponents.g_roomdb.b_db_typeCnvrtr

import androidx.room.TypeConverter
import java.util.Date

class MyTypeConverters {
    //TODO: SqLite supports: NULL, INTEGER, REAL, TEXT, BLOB datatypes only
    // to store other dataTypes values - we need TypeConverters
    @TypeConverter
    fun fromDateToLong(date: Date) :Long{
        return date.time
    }
    @TypeConverter
    fun fromLongToDate(long: Long): Date{
        return Date(long)
    }
}