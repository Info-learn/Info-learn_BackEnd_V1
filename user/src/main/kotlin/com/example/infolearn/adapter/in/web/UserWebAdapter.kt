package com.example.infolearn.adapter.`in`.web

import com.example.infolearn.adapter.`in`.web.dto.request.LoadUserByNameOrAccountIdDto
import com.example.infolearn.adapter.`in`.web.dto.request.Type
import com.example.infolearn.adapter.`in`.web.dto.response.UserResponse
import com.example.infolearn.application.port.`in`.LoadUserUseCase
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("user")
@Validated
class UserWebAdapter(
    private val loadUserUseCase: LoadUserUseCase
) {

    @GetMapping("load")
    fun loadUserByNameOrAccountId(
        @RequestBody @Valid
        req: LoadUserByNameOrAccountIdDto
    ): UserResponse{

        return when (req.type) {

            Type.ACCOUNT_ID -> {
                loadUserUseCase.loadUserResponseByAccountId(req.text)
            }

            Type.NAME -> {
                loadUserUseCase.loadUserResponseByName(req.text)
            }
        }

    }
}