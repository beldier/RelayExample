package com.example.myapplication.data.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// https://mocki.io/v1/46d8cc59-5016-44c7-8253-cb32241113c0
// https://mocki.io/v1/9839c134-3047-46bd-a99a-9f82e990e37a

const val API_ENDPOINT = "https://mocki.io"


object ApiClient {
    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()

    private val restAdapter = Retrofit.Builder()
        .baseUrl(API_ENDPOINT)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    val tasksService : TasksService = restAdapter.create(TasksService::class.java)

}