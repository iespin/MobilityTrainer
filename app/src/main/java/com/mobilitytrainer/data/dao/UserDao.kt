package com.mobilitytrainer.data.dao

@Dao
interface UserDao {
    @Insert suspend fun insert(user: User)
    @Query("SELECT * FROM users WHERE email = :email AND password = :password")
    suspend fun login(email: String, password: String): User?
}
