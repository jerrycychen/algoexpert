package com.algoexpert.program

fun nonConstructibleChange(coins: MutableList<Int>): Int {
    // Write your code here.
    coins.sort()
    var currentChange = 0
    for (coin in coins) {
        if (coin > currentChange + 1) {
            return currentChange + 1
        }
        currentChange += coin
    }
    return currentChange + 1
}
