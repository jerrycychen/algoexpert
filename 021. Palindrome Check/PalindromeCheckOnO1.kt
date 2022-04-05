package com.algoexpert.program

fun PalindromeCheckOnO1(string: String): Boolean {
    var leftIndex = 0
    var rightIndex = string.length - 1
    while (leftIndex < rightIndex) {
        if (string.get(leftIndex) != string.get(rightIndex)) {
            return false
        }
        leftIndex++
        rightIndex--
    }
    return true
}
