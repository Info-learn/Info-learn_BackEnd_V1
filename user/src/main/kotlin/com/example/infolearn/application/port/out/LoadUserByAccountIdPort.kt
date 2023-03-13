package com.example.infolearn.application.port.out

import com.example.infolearn.domain.User

interface LoadUserByAccountIdPort {

    fun findByAccountId(accountId: String): User?
}