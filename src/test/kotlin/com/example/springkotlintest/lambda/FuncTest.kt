package com.plaync.purpleon.cloud.ocsgameinformationserver.test


class FuncTest {


}

fun a(str: String) {
    println("$str 함수 a")
}

fun b(function: (String) -> Unit) {
    function("b")
}

fun main(args: Array<String>) {
    b(::a)
    var c: (String) -> Unit = { str -> println("$str 람다 함수") }
}