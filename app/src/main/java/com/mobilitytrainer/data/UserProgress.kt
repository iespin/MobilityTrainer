package com.mobilitytrainer.data

class UserProgress {
    @Entity(tableName = "progress-user")
    data class UserProgress(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val userId: Int,
        val trainingId: Int,
        val completed: Boolean,
        val date: String
    )

}