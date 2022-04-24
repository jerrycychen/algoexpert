package com.algoexpert.program

// O(n) time | O(n) space - where n is the number of elements in the input array
fun arrayOfProducts(array: List<Int): List<Int> {
    val products = MutableList(array.size) {1}

    var leftRunningProduct = 1
    for (i in 0..array.size - 1) {
        products[i] = leftRunningProduct
        leftRunningProduct *= array[i]
    }

    var rightRunningProduct = 1
    for (i in array.size-1 downTo 0) {
        products[i] *= rightRunningProduct
        rightRunningProduct *= array[i]
    }

    return products
}
