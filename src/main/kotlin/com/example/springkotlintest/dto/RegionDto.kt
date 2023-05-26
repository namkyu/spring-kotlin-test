package com.example.springkotlintest.dto

import com.example.springkotlintest.domain.Region
import com.example.springkotlintest.utils.ModelMapperUtils
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Positive
import jakarta.validation.constraints.Size


data class RegionDto(

    @field:Size(max = 7, message = "7자리까지 허용")
    var region: String,

    @field:Positive(message = "양수만 허용합니다.")
    var dataType: Int,

    @field:NotNull(message = "null이 될 수 없습니다.")
    var dateTime: String,
) {
    fun toEntity(): Region = ModelMapperUtils.map(this, Region::class.java)
}