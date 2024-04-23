package com.example.thong.data.container

import android.content.Context
import com.example.thong.data.service.AccountService
import com.example.thong.data.service.impl.AccountServiceImpl
import com.example.thong.data.service.module.FirebaseModule

class DefaultAppContainer(private val context: Context) : AppContainer {
    override val accountService: AccountService by lazy {
        AccountServiceImpl(FirebaseModule.auth())
    }
}