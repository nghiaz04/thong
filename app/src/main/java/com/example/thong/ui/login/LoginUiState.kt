package com.example.thong.ui.login

data class LoginUiState(
    val email: String = "",
    val password: String = "",

    val loginError: Boolean = false
)