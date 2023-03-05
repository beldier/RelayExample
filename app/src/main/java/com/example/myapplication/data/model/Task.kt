package com.example.myapplication.data.model

import com.google.gson.annotations.SerializedName

data class Task(

    @SerializedName("id") var id: String = "",
    @SerializedName("title") var title: String = "",
    @SerializedName("date") var date: String = "",
    @SerializedName("company") var company: String = "",
    @SerializedName("adress") var adress: String = "",
    @SerializedName("code") var code: String = "",

)
