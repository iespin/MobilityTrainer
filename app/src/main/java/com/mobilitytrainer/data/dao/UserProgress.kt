package com.mobilitytrainer.data.dao

@Dao
interface UserProgressDao {
    @Insert suspend fun insert(progress: UserProgress)

    @Query("SELECT * FROM progress-user WHERE usuarioId = :userId")
    suspend fun getUserProgress(userId: Int): List<UserProgress>
}
