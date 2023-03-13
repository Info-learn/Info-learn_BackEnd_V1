package com.example.infolearn.application.service

import com.example.infolearn.application.port.`in`.LoadUserUseCase
import com.example.infolearn.application.port.out.LoadUserPort
import org.springframework.stereotype.Service

@Service
class LoadUserService(
    private val loadUserPort: LoadUserPort
): LoadUserUseCase {

    override fun loadUserResponseByName(name: String) = (
            loadUserPort.findByName(name)
                ?: throw IllegalStateException()
            ).toUserResponse()

    override fun loadUserResponseByAccountId(accountId: String) = (
            loadUserPort.findByAccountId(accountId)
                ?: throw IllegalStateException()
            ).toUserResponse()

}