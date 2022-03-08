package com.algoexpert.program

open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

fun branchSums(root: BinaryTree): List<Int> {
    // Write your code here.
    val sums = mutableListOf<Int>()
    branchSums(root, 0, sums)
    return sums
}

fun branchSums(node: BinaryTree?, currentSum: Int, sums: MutableList<Int>) {
    if (node == null) {
        return
    }
    val newCurrentSum = currentSum + node.value
    // to check if the current node is a leaf node
    if (node.left == null && node.right == null) {
        sums.add(newCurrentSum)
        return
    }
    branchSums(node.left, newCurrentSum, sums)
    branchSums(node.right, newCurrentSum, sums)
}
