package com.algoexpert.program

// O(nlog(n) + mlog(m)) time | O(1) space
fun smallestDifference(arrayOne: MutableList<Int>, arrayTwo: MutableList<Int>): List<Int> {
    arrayOne.sort()
    arrayTwo.sort()
    var indexOne = 0
    var indexTwo = 0
    var smallest = Int.MAX_VALUE
    var current: Int
    var smallestPair = listOf<Int>()
    while (indexOne < arrayOne.size && indexTwo < arrayTwo.size) {
        var firstNum = arrayOne[indexOne]
        var secondNum = arrayTwo[indexTwo]
        if (firstNum < secondNum) {
            current = secondNum - firstNum
            indexOne++
        } else if (secondNum < firstNum) {
            current = firstNum - secondNum
            indexTwo++
        } else {
            return mutableListOf(firstNum, secondNum)
        }
        if (smallest > current) {
            smallest = current
            smallestPair = listOf<Int>(firstNum, secondNum)
        }
    }
    return smallestPair
}
