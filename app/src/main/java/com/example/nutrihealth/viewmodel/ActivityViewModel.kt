package com.example.nutrihealth.viewmodel

class ActivityViewModel(private val repository: ActivityRepository) : ViewModel() {
    private val _activities = MutableStateFlow<List<Activity>>(emptyList())
    val activities: StateFlow<List<Activity>> = _activities

    fun calculateNetCalories(): Double {
        // Lógica para calorías netas
    }
}