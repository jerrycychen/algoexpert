package com.algoexpert.program

import kotlin.math.abs

fun sortedSquaredArray(array: List<Int>): List<Int> {
    var i = 0 // head of list
    var j = array.size - 1 // tail of list
    val sortedSquares = array.map() { _ -> 0 }.toMutableList()
    var k = sortedSquares.size - 1

    while (true) {
        if (i == j) {
            // if iterating to last item, assign, break, and return
            sortedSquares[k] = array[i] * array[i]
            break
        }
        if (abs(array[i]) >= abs(array[j])) {
            sortedSquares[k] = array[i] * array[i]
            i++
            k--
        } else {
            sortedSquares[k] = array[j] * array[j]
            j--
            k--
        }
    }
    return sortedSquares
}
