package com.example.infolearn.application.port.`in`

import com.example.infolearn.adapter.`in`.web.dto.response.UserDetailsResponse
import com.example.infolearn.application.global.annotation.UseCase

@UseCase
interface LoadUserDetailsResponseUseCase {

    fun loadUserDetailsResponseByName(name: String): UserDetailsResponse

    fun loadUserDetailsResponseByAccountId(accountId: String): UserDetailsResponse
}