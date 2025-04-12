package com.mobilitytrainer.data

class Training {
    @Entity(tableName = "trainings")
    data class Training(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val name: String,
        val description: String,
        val urlVideo: String
    )
}