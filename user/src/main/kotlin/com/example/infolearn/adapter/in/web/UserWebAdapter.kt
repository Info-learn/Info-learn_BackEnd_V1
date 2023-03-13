package com.example.infolearn.adapter.`in`.web

import com.example.infolearn.adapter.`in`.web.dto.request.LoadUserByNameOrAccountIdDto
import com.example.infolearn.adapter.`in`.web.dto.request.Type
import com.example.infolearn.adapter.`in`.web.dto.response.UserDetailsResponse
import com.example.infolearn.application.port.`in`.LoadUserDetailsResponseUseCase
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
    private val loadUserDetailsResponseUseCase: LoadUserDetailsResponseUseCase
) {

    @GetMapping("load")
    fun loadUserByNameOrAccountId(

        @RequestBody @Valid
        req: LoadUserByNameOrAccountIdDto
    ): UserDetailsResponse{

        return when (req.type) {

            Type.ACCOUNT_ID -> {
                loadUserDetailsResponseUseCase.loadUserDetailsResponseByAccountId(req.text)
            }

            Type.NAME -> {
                loadUserDetailsResponseUseCase.loadUserDetailsResponseByName(req.text)
            }
        }

    }
}