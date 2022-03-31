package com.algoexpert.program

fun selectionSort(array: MutableList<Int>): List<Int> {
    if (array.size == 0) return array
    var smallestIndex: Int
    for (i in 0 until array.size - 1) {
        smallestIndex = i
        for (j in i + 1 until array.size) {
            if (array[j] < array[smallestIndex]) {
                smallestIndex = j
            }
        }
        if (smallestIndex != i) {
            swap(i, smallestIndex, array)
        }
    }
    return array
}

fun swap(i: Int, j: Int, array: MutableList<Int>) {
    array[i] = array[j].also { array[j] = array[i] }
}
