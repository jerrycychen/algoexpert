package com.algoexpert.program

fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var i = 0
    var j = 0
    while (true) {
        if (i == array.size || j == sequence.size) {
            break
        }
        if (array[i] == sequence[j]) {
            i++
            j++
        } else {
            i++
        }
    }
    return if (j == sequence.size) true else false
}
