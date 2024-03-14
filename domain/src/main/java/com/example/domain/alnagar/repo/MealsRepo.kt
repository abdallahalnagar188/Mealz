package com.example.domain.alnagar.repo

import com.example.domain.alnagar.entity.CategoryResponse

interface MealsRepo {
   suspend fun getMealsFromRemote(): CategoryResponse
}