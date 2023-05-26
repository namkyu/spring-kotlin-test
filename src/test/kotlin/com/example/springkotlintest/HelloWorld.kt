package com.example.springkotlintest

import org.junit.jupiter.api.Test

class HelloWorld

fun main(args: Array<String>) {
    println("test")

    var result = 3
    result *= 10
    result += 6
    println(result)

    var a = 1
    println(a++)
    println(++a)
    println(--a)
    println(a--)

    print(1.5.toInt())

    var n = 34_721_189
    println(n)
}