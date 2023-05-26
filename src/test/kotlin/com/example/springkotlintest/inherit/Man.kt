package com.example.springkotlintest.inherit
class Man(name: String, age: Int) : Person(name, age) {

    fun walk() {
        println("man walks")
    }
}