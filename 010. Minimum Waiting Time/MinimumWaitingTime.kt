package com.algoexpert.program

fun minimumWaitingTime(queries: MutableList<Int>): Int {
    if (queries.size == 1) return 0
    var currentWaitingTime = 0
    var totalWaitingTime = 0
    queries.sort()
    for (i in 1 until queries.size) {
        currentWaitingTime += queries[i - 1]
        totalWaitingTime += currentWaitingTime
    }
    return totalWaitingTime
}
