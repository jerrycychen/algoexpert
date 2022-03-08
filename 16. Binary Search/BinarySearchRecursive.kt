package com.algoexpert.program

fun binarySearch(array: List<Int>, target: Int): Int {
    // Write your code here.
    return binarySearch(array, target, 0, array.size - 1)
}

fun binarySearch(array: List<Int>, target: Int, left: Int, right: Int): Int {
    if (left > right) {
        return -1
    }
    var pivot: Int = (left + right) / 2
    if (array[pivot] == target) {
        return pivot
    } else if (array[pivot] < target) {
        return binarySearch(array, target, pivot + 1, right)
    } else {
        return binarySearch(array, target, left, pivot - 1)
    }
}
