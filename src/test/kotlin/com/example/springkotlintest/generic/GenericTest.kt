package com.example.springkotlintest.generic

import org.junit.jupiter.api.Test

class Box<T>(t: T) {
    var name = t
}

class MyClass<T>(val myProp: T)

fun <T> find(a: Array<T>, Target: T): Int {
    for (i in a.indices) {
        if (a[i] == Target) return i
    }
    return -1
}

fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}

class GenericTest {

    @Test
    fun test1() {
        val box1: Box<Int> = Box(1)
        val box2: Box<String> = Box("Hello")
        val box = Box(3)
        println(box1.name)
        println(box2.name)
    }

    @Test
    fun test2() {
        val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry")
        val arr2: Array<Int> = arrayOf(1, 2, 3)

        println("arr.indices = ${arr1.indices}")
        println(find(arr1, "Cherry"))
        println(find(arr2, 2))
    }

    @Test
    fun test3() {
        val result = add(2, 3) { a, b -> a + b } // 람다는 argument 밖으로 뺄 수 있다.
        println(result)
    }
}




