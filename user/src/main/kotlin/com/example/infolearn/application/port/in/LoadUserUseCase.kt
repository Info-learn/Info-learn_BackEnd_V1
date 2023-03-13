package com.example.infolearn.application.port.`in`

import com.example.infolearn.adapter.`in`.web.dto.response.UserResponse
import com.example.infolearn.application.global.annotation.UseCase

@UseCase
interface LoadUserUseCase {

    fun loadUserResponseByName(name: String): UserResponse

    fun loadUserResponseByAccountId(accountId: String): UserResponse
}