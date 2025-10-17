package com.example.nutrihealth.model

class User(
    val id: String,
    val name: String,
    val email: String,
    val anthropometricData: AnthropometricData,
    val dailyGoal: NutritionGoal
)