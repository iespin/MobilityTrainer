package com.mobilitytrainer.data

@Database(
    entities = [User::class, Training::class, UserProgress::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun trainingDao(): TrainingDao
    abstract fun userProgressDao(): UserProgressDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "mobility_trainer_db"
                ).build().also { INSTANCE = it }
            }
        }
    }
}
