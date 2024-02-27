package com.b2prashant.jetpackarchitecturecomponents.g_roomdb.a_intro

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ContactDao {
    @Insert suspend fun insertContact(contact: Contact)
    @Delete suspend fun deleteContact(contact: Contact)
    @Update fun updateContact(contact: Contact)
    //room checks fun return type LiveData- by default executes in bg thread
    @Query("Select * FROM contact")
    fun getContacts(): LiveData<List<Contact>>
}