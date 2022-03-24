package com.algoexpert.program

fun InsertionSort(array: MutableList<Int>): List<Int> {
    if (array.size == 0) return array
    for (i in 1 until array.size) {
        for (j in i - 1 downTo 0) {
            if (array[j] > array[j + 1]) {
                swap(j, j + 1, array)
            }
        }
    }
    return array
}

fun swap(i: Int, j: Int, array: MutableList<Int>) {
    array[i] = array[j].also { array[j] = array[i] }
}
