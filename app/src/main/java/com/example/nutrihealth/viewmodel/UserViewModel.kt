package com.example.nutrihealth.viewmodel

class UserViewModel(private val repository: UserRepository) : ViewModel() {
    private val _userData = MutableStateFlow<User?>(null)
    val userData: StateFlow<User?> = _userData

    private val _dailySummary = MutableStateFlow<DailySummary?>(null)
    val dailySummary: StateFlow<DailySummary?> = _dailySummary

    fun updateAnthropometricData(data: AnthropometricData) {
        viewModelScope.launch {
            // Lógica para actualizar
        }
    }
}