package com.example.springkotlintest

import org.junit.jupiter.api.Test
import java.lang.Math.PI
import kotlin.random.Random

class BookTest {

    @Test
    fun test_불타입() {
        val x = 1
        val y = 1
        println((x == 1) or (y == 1))
        println((x == 1) and (y == 1))
    }

    @Test
    fun test_문자열() {
        val hello = "Hello, world!"
        println(hello)

        val name = readln()
        println("Hello, $name")
    }

    @Test
    fun test_배열() {
        var a = emptyArray<String>()
        var b = arrayOf("hello", "world")
        var c = arrayOf(1, 4, 9)

        println(a)
        println(b)
        println(c)

        var squares = IntArray(10) { (it + 1) * (it + 1) }
        print(squares)
    }

    @Test
    fun test_배열사용() {
        val squares = arrayOf(1, 4, 9, 10)
        println(squares.size)
        println(squares.lastIndex)
        println(squares[3])
        println(squares[1])
    }

    fun increment(n: Int): Int {
//        return n++ // 컴파일 오류
        return n
    }

    fun increment(a: IntArray): Int {
        return ++a[0]
    }

    @Test
    fun test_참조() {
        val a = intArrayOf(1, 2, 3)
        println(increment(a))
    }

    fun prompt(name: String) {
        print("hello $name")
    }

    fun circleArea(radius: Double): Double = PI * radius * radius

    @Test
    fun test_이름붙은인자() {
        println(circleArea(1.3))
        println(circleArea(radius = 1.3))
    }

    fun restrictToRange(from: Int = Int.MIN_VALUE, to: Int = Int.MAX_VALUE): Int {
        return to
    }

    @Test
    fun test_파라미터디폴트값() {
        println(restrictToRange())
        println(restrictToRange(1, 2))
    }

    private fun readInt() = readLine()!!.toInt()

    @Test
    fun test_private제한자함수() {
        readInt()
    }

    @Test
    fun test_함수안에함수() {
        fun readInt(): Int = 1
        println(readInt())
    }

    @Test
    fun test_if문식() {
        var result = if (2 > 0) {
            "a"
        } else ""

        print(result)
    }

    @Test
    fun test_범위_진행_연산() {
        val charts = 'a'..'h'
        val twoDigits = 10..99
        val zero2One = 0.0..1.0
        println(charts)
        println(twoDigits)
        println(zero2One)

        println("def" in "abc".."xyz")
        println("zzz" in "abc".."xyz")

        println(1..10 step 3)
        println(15 downTo 9 step 2)
    }

    fun hexDigit(n: Int): Char {
        when {
            n in 0..9 -> return '0' + n
            n in 10..15 -> return 'A' + n
            else -> return '?'
        }
    }

    @Test
    fun test_when() {
        println(hexDigit(33))
    }

    @Test
    fun test_for문() {
        var a = IntArray(10) { it * it }
        var sum = 0
        for (x in a) {
            sum += x
        }
        print(sum)
    }

    @Test
    fun test_label_for() {
        val num = Random.nextInt(1, 101)

        loop@ while (true) {
            val guess = readLine()!!.toInt()
            val message = when {
                guess < num -> "Too small"
                guess > num -> "Too big"
                else -> break@loop
            }
            println(message)
        }
        println("Right: It's $num")
    }

    @Test
    fun test_예외던지기() {
        parseIntNumber("")
    }

    fun parseIntNumber(s: String): Int {
        if (s.length !in 1..31) throw java.lang.NumberFormatException("Not a number: $s")
        return 100
    }

    fun readInt(default: Int) = try {
        readLine()!!.toInt()
    } catch (e: java.lang.NumberFormatException) {
        default
    } finally {
        print("Error!!")
    }

    @Test
    fun test_val() {
        val num = sumExam(40, 20)
        println(num)

//        num = sumExam(40, 30) // 런타임 시에 오류 발생 Val cannot be reassigned
//        println(num)
    }

    fun sumExam(a: Int, b: Int) = a + b

    enum class Direction {
        NORTH, SOUTH, WEST, EAST
    }

    fun rotateClockwise(dir: Direction) = when (dir) {
        Direction.NORTH -> Direction.EAST
        Direction.EAST -> Direction.SOUTH
        Direction.SOUTH -> Direction.WEST
        Direction.WEST -> Direction.NORTH
    }

    @Test
    fun test_enum() {
        print(rotateClockwise(Direction.EAST))
        val values = Direction.values()
    }

    data class Person(val firstName: String, val familyName: String, val age: Int)

    fun Person.show() {
        println("com.example.springkotlintest.inherit.Person: $firstName $familyName, $age")
    }

    @Test
    fun test_dataclass() {
        val p1 = Person("John", "Smith", 42)
        val p2 = Person("John", "Smith", 42)
        val p3 = p1
        println(p1 == p2)
        println(p1 == p3)

        p1.show()
        p1.copy(firstName = "namkyu").show()
    }
}
