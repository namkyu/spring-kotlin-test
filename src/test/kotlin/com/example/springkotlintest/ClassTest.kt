package com.example.springkotlintest


class ClassTest {

    var firstName: String = ""
    var familyName: String = ""
    var age: Int = 0

    fun fullName() = "$firstName $familyName"

    fun showMe() {
        println("${fullName()}: $age")
    }
}

fun main() {
    val ct = ClassTest()
    ct.firstName = "namkyu"
    ct.familyName = "lee"
    ct.age = 25

    ct.showMe()
}