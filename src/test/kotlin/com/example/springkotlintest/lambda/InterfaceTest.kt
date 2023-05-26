package com.plaync.purpleon.cloud.ocsgameinformationserver.test


class InterfaceTest {

    interface Runner {
        fun run()
    }

    interface Eater {
        fun eat() {
            println("음식을 먹습니다.")
        }
    }

    class Dog : Runner, Eater {
        override fun run() {
            println("우다다 뜁니다.")
        }

        override fun eat() {
            println("허겁지겁 먹습니다.")
        }
    }
}

fun main() {
    val d = InterfaceTest.Dog()
    d.run()
    d.eat()
}