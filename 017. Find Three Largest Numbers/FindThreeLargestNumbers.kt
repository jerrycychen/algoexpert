package com.algoexpert.program

fun findThreeLargestNumbers(array: List<Int>): List<Int> {
    val threeLargest = mutableListOf(Int.MIN_VALUE, Int.MIN_VALUE, Int.MIN_VALUE)
    for (num in array) {
        updateLargest(threeLargest, num)
    }
    return threeLargest
}

fun updateLargest(threeLargest: MutableList<Int>, num: Int) {
    if (num > threeLargest[2]) {
        shiftAndUpdate(threeLargest, num, 2)
    } else if (num > threeLargest[1]) {
        shiftAndUpdate(threeLargest, num, 1)
    } else if (num > threeLargest[0]) {
        shiftAndUpdate(threeLargest, num, 0)
    }
}

fun shiftAndUpdate(threeLargest: MutableList<Int>, num: Int, index: Int) {
    for (i in 0 until index + 1) {
        if (i == index) {
            threeLargest[i] = num
        } else {
            threeLargest[i] = threeLargest[i + 1]
        }
    }
}
