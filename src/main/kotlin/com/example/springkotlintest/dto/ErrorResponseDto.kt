package com.example.springkotlintest.dto

// 예외 발생시 반환할 객체
data class ErrorResponseDto(
    val errorCode: String,
    val message: String?
) : ResponseDto