package com.example.todolist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.LocalDate
import java.time.LocalTime
import java.util.*

class TaskViewModel : ViewModel() {
    var taskItems = MutableLiveData<MutableList<TaskItem>>()

    init {
        taskItems.value = mutableListOf()
    }

    // add task
    fun addTaskItem(newTask: TaskItem) {
        val list = taskItems.value
        list!!.add(newTask)
        taskItems.postValue(list)
    }

    // update task
    fun updateTaskItem(id: UUID, name: String, desc: String, dueTime: LocalTime?) {
        val list = taskItems.value
        val task = list!!.find { it.id == id }!!
        task.name = name
        task.desc = desc
        task.dueTime = dueTime
        taskItems.postValue(list)
    }

    // set task as completed
    fun setCompleted(taskItem: TaskItem) {
        val list = taskItems.value
        val task = list!!.find { it.id == taskItem.id }!!
        if (task.completedDate == null)
            task.completedDate = LocalDate.now()
        taskItems.postValue(list)
    }

    // delete task
    fun deleteTaskItem(taskItem: TaskItem) {
        val list = taskItems.value
        list!!.removeAll { it.id == taskItem.id }
        taskItems.postValue(list)
    }
}