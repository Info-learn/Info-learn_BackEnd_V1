package com.example.infolearn.application.port.`in`

import com.example.infolearn.adapter.`in`.web.dto.request.Type
import com.example.infolearn.application.global.annotation.UseCase
import com.example.infolearn.domain.User

@UseCase
interface LoadUserUseCase {

    fun load(text: String, type: Type): User?
}