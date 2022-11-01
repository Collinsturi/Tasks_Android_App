package com.rsk.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TaskViewModel(val dao: TaskDao): ViewModel() {
    var newTaskName = ""

    fun addTask(){
        viewModelScope.launch {
            val task = Tasks()
            task.taskName = newTaskName
            dao.insert(task)
        }
    }
}