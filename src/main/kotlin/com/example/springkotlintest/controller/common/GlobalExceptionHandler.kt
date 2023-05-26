package com.example.springkotlintest.controller.common

import com.example.springkotlintest.dto.ErrorResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(value = [CustomException::class])
    fun handlingCustomException(ex: CustomException): ResponseEntity<ErrorResponseDto> {
        val errorCode: ErrorCode = ex.errorCode
        val errorDto = ErrorResponseDto(errorCode = errorCode.name, message = errorCode.message)
        return ResponseEntity(errorDto, errorCode.status)
    }
}

class CustomException(
    val errorCode: ErrorCode
) : RuntimeException()

enum class ErrorCode(val status: HttpStatus, val message: String) {
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "유저 정보를 찾을 수 없습니다"),
}