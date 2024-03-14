package com.example.data.alnagar.data.repo

import com.example.data.alnagar.data.remote.ApiService
import com.example.domain.alnagar.entity.CategoryResponse
import com.example.domain.alnagar.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}