package com.d121201042.aplication_task.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.d121201042.aplication_task.data.TaskDatabase
import com.d121201042.aplication_task.model.Task
import com.d121201042.aplication_task.repository.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaskViewModel(application: Application):AndroidViewModel(application) {
    val readAllData:LiveData<List<Task>>
    val readAllDataHistory:LiveData<List<Task>>
    private val repository:TaskRepository
    init{
        val taskDao = TaskDatabase.getDatabase(application).taskDao()
        repository = TaskRepository(taskDao)
        readAllData = repository.readAllData
        readAllDataHistory = repository.readAllDataHistory
    }

    fun addtask(task: Task){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addtask(task)
        }
    }
}
