package com.algoexpert.program

import kotlin.math.max

// O(n) time | O(1) space - where n is the length of the input array
fun longestPeak(array: List<Int>): Int {
    var longestPeakLength = 0
    var i = 1
    while (i < array.size - 1) {
        val isPeak: Boolean = array[i] > array[i - 1] && array[i] > array[i + 1]
        if (!isPeak) {
            i++
            continue
        }

        var leftIndex = i - 2
        while (leftIndex >= 0 && array[leftIndex] < array[leftIndex + 1]) {
            leftIndex--
        }

        var rightIndex = i + 2
        while (rightIndex < array.size && array[rightIndex] < array[rightIndex - 1]) {
            rightIndex++
        }

        val currentPeakLength = rightIndex - leftIndex - 1
        longestPeakLength = max(currentPeakLength, longestPeakLength)
        i = rightIndex
    }
    return longestPeakLength
}
