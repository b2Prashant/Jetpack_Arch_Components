package com.b2prashant.jetpackarchitecturecomponents.g_roomdb.a_intro

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.b2prashant.jetpackarchitecturecomponents.g_roomdb.b_db_typeCnvrtr.MyTypeConverters

@Database(entities = [Contact::class], version = 1)
@TypeConverters(MyTypeConverters::class)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun contactDao(): ContactDao
    companion object {
        @Volatile   //asa instance value is assign - all threads get notified
        private var instance: ContactDatabase? = null

        fun getDatabase(context: Context) : ContactDatabase{
            if(instance == null) {
               synchronized(this) {
                   instance = Room.databaseBuilder(context.applicationContext,
                        ContactDatabase::class.java, "contactDB").build()
               }
            }
            return instance!!
        }
    }
}