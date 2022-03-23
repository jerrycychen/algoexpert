package com.algoexpert.program

fun bubbleSort(array: MutableList<Int>): List<Int> {
    if (array.size == 0) {
        return array
    }
    var isSorted = false
    var counter = 0
    while (!isSorted) {
        isSorted = true
        for (i in 0 until array.size - 1 - counter) {
            if (array[i] > array[i + 1]) {
                swap(i, i + 1, array)
                isSorted = false
            }
        }
        counter++
    }
    return array
}

fun swap(i: Int, j: Int, array: MutableList<Int>) {
    array[i] = array[j].also { array[j] = array[i] }
}
