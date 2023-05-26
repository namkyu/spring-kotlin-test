package com.plaync.purpleon.cloud.ocsgameinformationserver.test


class LambdaTest {
}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}

fun main(args: Array<String>) {
    var a = Book("코틀린", 10000).apply {
        name = "[초특가] $name"
        discount()
    }
    println(a)

    a.run {
        println("상품명: $name, 가격: $price")
    }
}