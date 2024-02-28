package com.b2prashant.jetpackarchitecturecomponents.g_roomdb.a_intro

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val phone: String,
    //TODO: we cant save Date directly
    val createdDate: Date
)
