package com.mobilitytrainer.data.dao

@Dao
interface TrainingDao {
    @Query("SELECT * FROM trainings")
    suspend fun getAll(): List<Training>

    @Insert suspend fun insert(training: Training)
}
