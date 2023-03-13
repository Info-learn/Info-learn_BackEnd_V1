package com.example.infolearn.exception

open class BusinessException(
    message: String,
    val errorCode: ErrorCode
) : RuntimeException() {
    override val message: String = message
}