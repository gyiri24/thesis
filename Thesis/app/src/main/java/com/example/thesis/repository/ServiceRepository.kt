package com.example.thesis.repository

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.thesis.data.model.Service
import com.google.gson.Gson
import java.io.IOException
import com.google.gson.reflect.TypeToken

class ServiceRepository(private val context: Context)  {

    private val servicesLiveData = MutableLiveData<List<Service>>()

    fun getServices(): List<Service> {
        return loadServices(context)
    }

    fun loadServices(context: Context): List<Service> {
        val json: String
        try {
            val inputStream = context.assets.open("services.json")
            json = inputStream.bufferedReader().use { it.readText() }
        } catch (e: IOException) {
            e.printStackTrace()
            return emptyList()
        }

        val gson = Gson()
        val type = object : TypeToken<List<Service>>() {}.type

        return gson.fromJson(json, type) ?: emptyList()
    }
}