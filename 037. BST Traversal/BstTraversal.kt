package com.algoexpert.program

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}

// O(n) time | O(n) space
fun inOrderTraverse(tree: BST?, array: MutableList<Int>): List<Int> {
    if (tree != null) {
        inOrderTraverse(tree.left, array)
        array.add(tree.value)
        inOrderTraverse(tree.right, array)
    }
    return array
}

// O(n) time | O(n) space
fun preOrderTraverse(tree: BST?, array: MutableList<Int>): List<Int> {
    if (tree != null) {
        array.add(tree.value)
        inOrderTraverse(tree.left, array)
        inOrderTraverse(tree.right, array)
    }
    return array
}

// O(n) time | O(n) space
fun postOrderTraverse(tree: BST?, array: MutableList<Int>): List<Int> {
    if (tree != null) {
        inOrderTraverse(tree.left, array)
        inOrderTraverse(tree.right, array)
        array.add(tree.value)
    }
    return array
}
