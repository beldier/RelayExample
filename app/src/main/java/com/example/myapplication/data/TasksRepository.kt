package com.example.myapplication.data

import com.example.myapplication.data.model.Task
import com.example.myapplication.data.network.ApiClient

object TasksRepository {

    suspend fun getTasks(): List<Task> {
        return ApiClient.tasksService.getTasks()
    }

}