package com.example.infolearn.adapter.`in`.web.dto.request

import javax.validation.constraints.NotBlank

data class LoadUserByNameOrAccountIdDto(

    @field:NotBlank
    val text: String,
    val type: Type
)

enum class Type {
    ACCOUNT_ID,
    NAME
}

