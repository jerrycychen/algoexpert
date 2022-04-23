package com.algoexpert.program

// O(n^2) time | O(n) space - where n is the length of the input array
fun arrayOfProducts(array: List<Int>): List<Int> {
    val products = MutableList(array.size) { 1 }
    for (i in 0..array.size - 1) {
        var runningProduct = 1
        for (j in 0..array.size - 1) {
            if (i != j) runningProduct *= array[j]
        }
        products[i] = runningProduct
    }
    return products
}
