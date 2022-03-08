package com.algoexpert.program

fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
    if (array.size < 2) {
        return listOf<Int>()
    }
    var diff: Int
    val map = mutableMapOf<Int, Boolean>()
    for (num in array) {
        diff = targetSum - num
        if (map.containsKey(diff)) {
            return listOf<Int>(diff, num)
        }
        map[num] = true
    }
    return listOf<Int>()
}
