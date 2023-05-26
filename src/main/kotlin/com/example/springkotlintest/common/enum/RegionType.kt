package com.example.springkotlintest.common.enum

enum class RegionType(val code: Int, val regionName: String) {

    A(100, "seoul"),
    A1(101, "gangnam"),
    B(200, "gyunggi"),
    B1(201, "bundang")
    ;

    companion object {
        fun find(code: Int) = values().find {
            it.code == code
        } ?: throw IllegalArgumentException("EnumTest not found for code: $code")

        fun find(regionName: String) = values().find {
            it.regionName == regionName
        } ?: throw IllegalArgumentException("EnumTest not found for regionName: $regionName")

        fun exists(regionName: String) = values().any {
            it.regionName == regionName
        }
    }
}