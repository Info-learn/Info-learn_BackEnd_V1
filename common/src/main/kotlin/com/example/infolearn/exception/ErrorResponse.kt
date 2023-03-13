package com.example.infolearn.exception

import org.springframework.http.HttpStatus

data class ErrorResponse(
    val message: String,
    val status: HttpStatus,
    val code: String
) {

    constructor(
        message: String? = null,
        errorCode: ErrorCode
    ): this(
        message
            ?: errorCode.message,
        errorCode.status,
        errorCode.code
    )
}

