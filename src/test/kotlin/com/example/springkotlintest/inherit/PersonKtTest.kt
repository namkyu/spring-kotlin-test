package com.example.springkotlintest.inherit

import org.junit.jupiter.api.Test


internal class PersonKtTest {

    @Test
    fun testClass() {
        val person = Person("nklee", 1990)
        val person1 = Person("nklee")
    }

    @Test
    fun testParentClass() {
        Man("nklee", 1990).walk()
    }
}