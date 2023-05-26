package com.example.springkotlintest.controller.valid

import jakarta.validation.Constraint
import kotlin.reflect.KClass


@Constraint(validatedBy = [RegionValidator::class])
@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME) // runtime 에만 활용할 수 있도록 한다.
annotation class ValidRegion(
    val message: String = "유효하지 않습니다.",

    // default 값
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Any>> = [],
)