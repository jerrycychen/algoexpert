package com.algoexpert.program

fun firstDuplicateValue(array: MutableList<Int>): Int {
    val seen = mutableSetOf<Int>()
    for (num in array) {
        if (num in seen) return num
        seen.add(num)
    }
    return -1
}
