package com.d121201042.aplication_task.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.d121201042.aplication_task.model.Task
import kotlinx.coroutines.InternalCoroutinesApi

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskDatabase:RoomDatabase() {
    abstract fun taskDao():TaskDao

    companion object{
        @Volatile
        private var INSTANCE: TaskDatabase ?= null
        @OptIn(InternalCoroutinesApi::class)
        fun getDatabase(context: Context):TaskDatabase{
            val tempDistance = INSTANCE
            if(tempDistance != null){
                return tempDistance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TaskDatabase::class.java,
                    "task_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}