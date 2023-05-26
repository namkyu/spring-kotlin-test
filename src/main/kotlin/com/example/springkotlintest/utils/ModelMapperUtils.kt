package com.example.springkotlintest.utils

import org.modelmapper.ModelMapper


class ModelMapperUtils {

    companion object {
        fun <T> map(src: Any, dest: Class<T>): T {
            return ModelMapper().map(src, dest)
        }
    }
}