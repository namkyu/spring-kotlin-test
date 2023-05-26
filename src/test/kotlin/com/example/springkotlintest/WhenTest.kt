package com.example.springkotlintest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class WhenTest {

    enum class Direction {
        NORTH, SOUTH, WEST, EAST
    }

    private fun rotateClockwise(dir: Direction) = when (dir) {
        Direction.NORTH -> Direction.EAST
        Direction.EAST -> Direction.SOUTH
        Direction.SOUTH -> Direction.WEST
        Direction.WEST -> Direction.NORTH
    }

    @Test
    fun test_enum() {
        val rotateClockwise = rotateClockwise(Direction.EAST)
        assertEquals(rotateClockwise, Direction.SOUTH)
    }

}