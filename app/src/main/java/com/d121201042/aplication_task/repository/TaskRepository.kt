package com.d121201042.aplication_task.repository

import androidx.lifecycle.LiveData
import com.d121201042.aplication_task.data.TaskDao
import com.d121201042.aplication_task.model.Task

class TaskRepository(private val taskDao: TaskDao) {
    val readAllData:LiveData<List<Task>> = taskDao.readAllData()
    val readAllDataHistory:LiveData<List<Task>> = taskDao.readAllDataHistory()

    suspend fun addtask(task: Task){
        taskDao.addTask(task)
    }
}