package com.algoexpert.program

fun tandemBicycle(
        redShirtSpeeds: MutableList<Int>,
        blueShirtSpeeds: MutableList<Int>,
        fastest: Boolean
): Int {
    var size: Int = redShirtSpeeds.size
    var sum: Int = 0
    if (size == 1) return maxOf(redShirtSpeeds[0], blueShirtSpeeds[0])
    if (fastest == true) {
        redShirtSpeeds.sort()
    } else {
        redShirtSpeeds.sortDescending()
    }
    blueShirtSpeeds.sortDescending()
    redShirtSpeeds.forEachIndexed { i, redShirtSpeed ->
        sum += maxOf(redShirtSpeed, blueShirtSpeeds[i])
    }
    return sum
}
