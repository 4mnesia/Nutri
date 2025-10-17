package com.example.nutrihealth.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ProgressBar {
    @Composable
    fun CalorieProgressBar(
        consumed: Double,
        goal: Double,
        burned: Double = 0.0
    ) {
        val netCalories = consumed - burned
        val progress = (netCalories / goal).coerceIn(0f, 1f)

        LinearProgressIndicator(
            progress = progress,
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
    }
}