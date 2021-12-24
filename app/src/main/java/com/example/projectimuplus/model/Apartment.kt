package com.example.projectimuplus.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_apartment")
data class Apartment(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = "apartment_name")
    var apartmentName: String,

    @ColumnInfo(name = "floor_number")
    var floorNumber: Int,

    @ColumnInfo(name = "room_number")
    var roomNumber: Int,

    @ColumnInfo(name = "price")
    var price: Double,

    @ColumnInfo(name = "city")
    var city: String,

    @ColumnInfo(name = "town")
    var town: String,

    @ColumnInfo(name = "address")
    var address: String,

    @ColumnInfo(name = "status")
    var status: Boolean = false,
)