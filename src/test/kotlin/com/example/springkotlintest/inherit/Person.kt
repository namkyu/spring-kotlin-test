package com.example.springkotlintest.inherit
open class Person(var name: String, var birthYear: Int) {
    init {
        println("name: $name, age: $birthYear")
    }

    constructor(name: String) : this(name, 1990) {
        println("name: $name")
    }
}