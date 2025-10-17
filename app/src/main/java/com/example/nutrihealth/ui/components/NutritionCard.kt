package com.example.nutrihealth.ui.components

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable

class NutritionCard {
    @SuppressLint("NotConstructor")
    @Composable
    fun NutritionCard(
        calories: Double,
        protein: Double,
        carbs: Double,
        fat: Double,
        onEditClick: () -> Unit
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Contenido de la tarjeta nutricional
        }
    }
}