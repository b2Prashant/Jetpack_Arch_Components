package com.b2prashant.jetpackarchitecturecomponents.g_roomdb.a_intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.room.Room
import com.b2prashant.jetpackarchitecturecomponents.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RoomDbIntroActivity : AppCompatActivity() {
    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_db_intro)
        database = Room.databaseBuilder(applicationContext, ContactDatabase::class.java, "contactDB").build()
        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0, "John", "9876533213"))
        }
    }
    fun getContactList(view: View) {
        database.contactDao().getContacts().observe(this, Observer {
            Toast.makeText(this, it.last().toString(), Toast.LENGTH_SHORT).show()
            Log.d("RoomDbIntroActivity", "RoomDbIntroActivity contactList: $it")
        })
    }
}