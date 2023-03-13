package com.example.infolearn.application.service

import com.example.infolearn.adapter.`in`.web.dto.request.Type
import com.example.infolearn.application.port.`in`.LoadUserUseCase
import com.example.infolearn.application.port.out.LoadUserByAccountIdPort
import com.example.infolearn.application.port.out.LoadUserByNamePort
import org.springframework.stereotype.Service

@Service
class LoadUserService(
    private val loadUserByNamePort: LoadUserByNamePort,
    private val loadUserByAccountIdPort: LoadUserByAccountIdPort
): LoadUserUseCase {

    override fun load(text: String, type: Type) = when(type){

            Type.ACCOUNT_ID -> loadUserByNamePort.findByName(text)

            Type.NAME -> loadUserByAccountIdPort.findByAccountId(text)
        }

}