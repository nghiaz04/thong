package com.example.thong.data.service

interface AccountService {

    suspend fun createAccountWithEmailAndPassword(email: String, password: String)
    suspend fun signInWithEmailAndPassword(email: String, password: String)

}