package com.algoexpert.program

fun isMonotonic(array: List<Int>): Boolean {
    var isNonDecreasing = true
    var isNonIncreasing = true
    for (i in 1 until array.size) {
        if (array[i] < array[i - 1]) isNonDecreasing = false
        if (array[i] > array[i - 1]) isNonIncreasing = false
    }
    return isNonIncreasing || isNonDecreasing
}
