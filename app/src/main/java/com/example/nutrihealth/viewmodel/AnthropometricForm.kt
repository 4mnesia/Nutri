package com.example.nutrihealth.viewmodel

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.nutrihealth.model.AnthropometricData

class AnthropometricForm {
    @SuppressLint("NotConstructor")
    @Composable
    fun AnthropometricForm(
        onSave: (AnthropometricData) -> Unit
    ) {
        var height by remember { mutableStateOf("") }
        var weight by remember { mutableStateOf("") }

        Column {
            OutlinedTextField(
                value = height,
                onValueChange = { height = it },
                label = { Text("Estatura (cm)") }
            )
            // Más campos...
        }
    }






