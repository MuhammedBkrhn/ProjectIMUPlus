package com.example.projectimuplus.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.projectimuplus.model.Apartment
import com.example.projectimuplus.model.Personnel


@Database(entities = [Apartment::class,Personnel::class], version = 1, exportSchema = false)
abstract class DataBase : RoomDatabase() {

}