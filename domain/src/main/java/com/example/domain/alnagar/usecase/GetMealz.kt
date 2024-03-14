package com.example.domain.alnagar.usecase

import com.example.domain.alnagar.repo.MealsRepo

class GetMealz(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}