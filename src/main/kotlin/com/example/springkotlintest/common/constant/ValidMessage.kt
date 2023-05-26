package com.example.springkotlintest.common.constant


// object로 클래스를 정의하면 싱글턴 패턴이 적용된다.
object ValidMessage {

    const val NOT_NULL = "must not be null"
    const val NOT_EMPTY = "must not be empty"
    const val NOT_BLANK = "must not be blank"
    const val NOT_NEGATIVE = "must be greater than or equal to 0"
}