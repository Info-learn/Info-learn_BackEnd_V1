package com.example.infolearn.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(
    val status: HttpStatus,
    val code: String,
    val message: String
) {

    //404
    PERSISTENCE_DATA_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "N01", "저장된 값을 찾지 못했습니다."),
    INPUT_DATA_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "N02", "입력값을 찾지 못했습니다.")
}
