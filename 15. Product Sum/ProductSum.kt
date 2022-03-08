package com.algoexpert.program

fun productSum(array: List<*>): Int {
    // Write your code here.
    return productSumHelper(array, 1)
}

fun productSumHelper(array: List<*>, multiplier: Int): Int {
    var sum = 0
    for (element in array) {
        if (element is List<*>) {
            sum += productSumHelper(element, multiplier + 1)
        } else {
            sum += element as Int
        }
    }
    return sum * multiplier
}
