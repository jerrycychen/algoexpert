package com.algoexpert.program

fun getNthFib(n: Int): Int {
    var lastTwo = Pair(0, 1)
    var counter = 3
    while (counter <= n) {
        var nextFib = lastTwo.first + lastTwo.second
        lastTwo = Pair(lastTwo.second, nextFib)
        counter++
    }
    return if (n <= 1) lastTwo.first else lastTwo.second
}
