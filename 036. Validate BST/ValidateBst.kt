package com.algoexpert.program

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}

// O(n) time | O(d) space
fun validateBst(tree: BST): Boolean {
    return validateBstHelper(tree, Int.MIN_VALUE, Int.MAX_VALUE)
}

fun validateBstHelper(tree: BST?, minValue: Int, maxValue: Int): Boolean {
    if (tree == null) return true
    if (tree.value < minValue || tree.value >= maxValue) return false
    val leftIsValid = validateBstHelper(tree.left, minValue, tree.value)
    return leftIsValid && validateBstHelper(tree.right, tree.value, maxValue)
}
