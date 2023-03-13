package com.example.infolearn.adapter.`in`.web

import com.example.infolearn.adapter.`in`.web.dto.request.LoadUserByNameOrAccountIdDto
import com.example.infolearn.application.port.`in`.LoadUserUseCase
import com.example.infolearn.exception.BusinessException
import com.example.infolearn.exception.ErrorCode
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
    ) = (
            loadUserUseCase.load(req.text, req.type)
                ?: throw BusinessException(
                    "User Not Found",
                    ErrorCode.PERSISTENCE_DATA_NOT_FOUND_ERROR
                )
            ).toUserDetailsResponse()
}