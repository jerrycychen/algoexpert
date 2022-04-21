package com.algoexpert.program

fun moveElementToEnd(array: MutableList<Int>, toMove: Int): List<Int> {
    var i = 0
    var j = array.size - 1
    while (i < j) {
        while (i < j && array.get(j) == toMove) j--
        if (array.get(i) == toMove) swap(i, j, array)
        i++
    }
    return array
}

fun swap(i: Int, j: Int, array: MutableList<Int>) {
    val temp = array[j]
    array[j] = array[i]
    array[i] = temp
}
