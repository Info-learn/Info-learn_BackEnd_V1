package com.example.infolearn.application.port.out

import com.example.infolearn.domain.User

interface LoadUserPort {

    fun findByName(name: String): User?

    fun findByAccountId(accountId: String): User?
}