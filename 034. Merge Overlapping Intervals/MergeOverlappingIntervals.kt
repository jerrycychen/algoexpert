package com.algoexpert.program

import kotlin.math.max

// O(nlog(n)) time | O(n) space - where n is the length of the input array
fun mergeOverlappingIntervals(intervals: List<List<Int>>): List<List<Int>> {
    // Sort the intervals by starting value
    var sortedIntervals =
            intervals
                    .toMutableList()
                    .sortedWith(Comparator<List<Int>> { a, b -> a[0].compareTo(b[0]) })
    sortedIntervals = sortedIntervals.map { it -> it.toMutableList() }

    val mergedIntervals = mutableListOf<MutableList<Int>>()
    var currentInterval = sortedIntervals[0]
    mergedIntervals.add(currentInterval)

    for (nextInterval in sortedIntervals) {
        val (currentIntervalStart, currentIntervalEnd) = currentInterval
        val (nextIntervalStart, nextIntervalEnd) = nextInterval

        if (currentIntervalEnd >= nextIntervalStart) {
            currentInterval[1] = max(currentIntervalEnd, nextIntervalEnd)
        } else {
            currentInterval = nextInterval
            mergedIntervals.add(currentInterval)
        }
    }

    return mergedIntervals
}
