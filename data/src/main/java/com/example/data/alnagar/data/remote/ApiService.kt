package com.example.data.alnagar.data.remote

import com.example.domain.alnagar.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    fun getMeals():CategoryResponse
}