package com.algoexpert.program

fun isMonotonic(array: List<Int>): Boolean {
    if (array.size <= 2) return true

    var direction = array[1] - array[0]
    for (i in 2 until array.size) {
        if (direction == 0) {
            direction = array[i] - array[i - 1]
            continue
        }
        if (breaksDirection(direction, array[i - 1], array[i])) {
            return false
        }
    }
    return true
}

fun breaksDirection(direction: Int, previousInt: Int, currentInt: Int): Boolean {
    val difference = currentInt - previousInt
    if (direction > 0) return difference < 0
    return difference > 0
}
