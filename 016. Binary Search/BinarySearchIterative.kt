package com.algoexpert.program

fun binarySearch(array: List<Int>, target: Int): Int {
    // Write your code here.
    return binarySearch(array, target, 0, array.size - 1)
}

fun binarySearch(array: List<Int>, target: Int, left: Int, right: Int): Int {
    var pivot: Int
    var l = left
    var r = right
    while (l <= r) {
        pivot = (l + r) / 2
        if (array[pivot] == target) {
            return pivot
        } else if (array[pivot] < target) {
            l = pivot + 1
        } else {
            r = pivot - 1
        }
    }
    return -1
}
