package com.example.nutrihealth.viewmodel

class NutritionViewModel(private val repository: FoodRepository) : ViewModel() {
    private val _foods = MutableStateFlow<List<Food>>(emptyList())
    val foods: StateFlow<List<Food>> = _foods

    fun addFood(food: Food) {
        viewModelScope.launch {
            repository.addFood(food)
        }
    }
}