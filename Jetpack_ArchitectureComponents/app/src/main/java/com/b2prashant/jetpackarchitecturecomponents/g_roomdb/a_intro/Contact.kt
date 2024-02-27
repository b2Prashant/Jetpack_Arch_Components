package com.b2prashant.jetpackarchitecturecomponents.g_roomdb.a_intro

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val phone: String
)
