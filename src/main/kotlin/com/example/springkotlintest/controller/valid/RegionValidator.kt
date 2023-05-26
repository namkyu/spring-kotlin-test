package com.example.springkotlintest.controller.valid

import com.example.springkotlintest.common.enum.RegionType
import com.example.springkotlintest.dto.RegionDto
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext


class RegionValidator : ConstraintValidator<ValidRegion, RegionDto> {

    var defaultMessage: String? = null

    override fun initialize(constraintAnnotation: ValidRegion) {
        defaultMessage = constraintAnnotation.message
    }

    override fun isValid(regionDto: RegionDto, context: ConstraintValidatorContext): Boolean {
        return RegionType.exists(regionDto.region)
    }

}