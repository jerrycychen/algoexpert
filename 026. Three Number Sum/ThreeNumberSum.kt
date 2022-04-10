package com.algoexpert.program

fun threeNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
    array.sort()
    val triplets = mutableListOf<MutableList<Int>>()
    for (i in 0 until array.size - 2) {
        var left = i + 1
        var right = array.size - 1
        var diff = targetSum - array[i]
        while (left < right) {
            if (array[left] + array[right] == diff) {
                triplets.add(mutableListOf(array[i], array[left], array[right]))
                left++
                right--
            } else if (array[left] + array[right] < diff) {
                left++
            } else {
                right--
            }
        }
    }
    return triplets
}
