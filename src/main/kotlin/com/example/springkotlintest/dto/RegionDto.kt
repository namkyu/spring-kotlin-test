package com.example.springkotlintest.dto

import com.example.springkotlintest.domain.Region
import com.example.springkotlintest.utils.ModelMapperUtils


data class RegionDto(
    var region: String,
    var dataType: Int,
    var dateTime: String,
) {
    fun toEntity(): Region = ModelMapperUtils.map(this, Region::class.java)
}