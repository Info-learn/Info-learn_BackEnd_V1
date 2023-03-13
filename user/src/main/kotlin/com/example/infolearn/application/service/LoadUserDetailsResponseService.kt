package com.example.infolearn.application.service

import com.example.infolearn.application.port.`in`.LoadUserDetailsResponseUseCase
import com.example.infolearn.application.port.out.LoadUserPort
import org.springframework.stereotype.Service

@Service
class LoadUserDetailsResponseService(

    private val loadUserPort: LoadUserPort
): LoadUserDetailsResponseUseCase {

    override fun loadUserDetailsResponseByName(name: String) = (
            loadUserPort.findByName(name)
                ?: throw IllegalStateException()
            ).toUserDetailsResponse()

    override fun loadUserDetailsResponseByAccountId(accountId: String) = (
            loadUserPort.findByAccountId(accountId)
                ?: throw IllegalStateException()
            ).toUserDetailsResponse()

}