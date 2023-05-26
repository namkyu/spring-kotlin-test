package com.example.springkotlintest


class ClassTest2 {

    var firstName: String = ""
    var familyName: String = ""
    var age: Int = 0

    constructor(firstName: String, familyName: String) {
        this.firstName = firstName
        this.familyName = familyName
    }

    fun fullName() = "$firstName $familyName"

    fun showMe() {
        println("${fullName()}: $age")
    }
}

fun main() {
    val ct = ClassTest2("namkyu", "lee")
    ct.showMe()
}