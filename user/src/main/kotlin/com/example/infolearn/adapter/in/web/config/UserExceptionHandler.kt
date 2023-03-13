package com.example.infolearn.adapter.`in`.web.config

import com.example.infolearn.exception.BusinessException
import com.example.infolearn.exception.ErrorCode
import com.example.infolearn.exception.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.validation.ValidationException

@ControllerAdvice
class UserExceptionHandler {

    @ExceptionHandler(BusinessException::class)
    fun businessExceptionHandler(e: BusinessException): ResponseEntity<*> {
        return ResponseEntity.status(e.errorCode.status).body(
            ErrorResponse(
                e.message,
                e.errorCode
            )
        )
    }

    @ExceptionHandler(ValidationException::class)
    fun validationExceptionHandler(e: ValidationException): ResponseEntity<*> {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
            ErrorResponse(
                e.message,
                ErrorCode.INPUT_DATA_NOT_FOUND_ERROR
            )
        )
    }

}

