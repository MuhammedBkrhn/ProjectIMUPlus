package com.example.projectimuplus.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.projectimuplus.model.Apartment

@Dao
interface ApartmentDatabaseDao {

    @Query("Select * From tbl_apartment where status =0")
    fun getUnsoldList(): LiveData<List<Apartment>>

    @Query("Select * From tbl_apartment where status =1")
    fun getSoldList(): LiveData<List<Apartment>>

    @Insert
    fun insert(item:Apartment)

    @Update
    fun update(item: Apartment)

    @Delete
    fun delete(item: Int)
}