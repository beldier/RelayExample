package com.example.myapplication.data.network

import com.example.myapplication.data.model.Task
import retrofit2.http.GET

interface TasksService{

    @GET("/v1/f21573f7-9b79-4135-86a5-8818010d94f2")
    suspend fun getTasks():List<Task>

}
