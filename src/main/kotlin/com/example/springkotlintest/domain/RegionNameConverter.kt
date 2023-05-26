package com.example.springkotlintest.domain

import com.example.springkotlintest.common.enum.RegionType
import jakarta.persistence.AttributeConverter

class RegionNameConverter : AttributeConverter<String, Int> {

    override fun convertToDatabaseColumn(regionName: String): Int {
        return RegionType.find(regionName).code
    }

    override fun convertToEntityAttribute(regionCode: Int): String {
        return RegionType.find(regionCode).regionName
    }
}
