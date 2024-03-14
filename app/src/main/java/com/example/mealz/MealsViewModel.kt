package com.example.mealz

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.alnagar.entity.CategoryResponse
import com.example.domain.alnagar.usecase.GetMealz
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealsUsaCase: GetMealz
) : ViewModel() {
    private val _categories: MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
    val categories :StateFlow<CategoryResponse?> = _categories
    fun getMeals() {
        viewModelScope.launch {
            try {
                _categories.value = getMealsUsaCase()
            } catch (e: Exception) {
                Log.e("MealsViewModel", e.message.toString())
            }
        }
    }
}