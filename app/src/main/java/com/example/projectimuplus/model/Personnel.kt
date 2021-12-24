package com.example.projectimuplus.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "personnel")
data class Personnel(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "surname")
    var surname: String,

    @ColumnInfo(name = "age")
    var age:Int,

    @ColumnInfo(name = "address")
    var address: String,

    @ColumnInfo(name = "blood_group")
    var bloodGroup: String,

    @ColumnInfo(name = "phone")
    var phone: String,
)