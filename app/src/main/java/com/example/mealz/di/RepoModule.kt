package com.example.mealz.di

import com.example.data.alnagar.data.remote.ApiService
import com.example.data.alnagar.data.repo.MealsRepoImpl
import com.example.domain.alnagar.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo {
        return MealsRepoImpl(apiService)
    }
}