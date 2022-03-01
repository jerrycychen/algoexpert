package com.algoexpert.program

open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

fun nodeDepths(root: BinaryTree): Int {
    return nodeDepths(root, 0)
}

fun nodeDepths(node: BinaryTree?, depths: Int): Int {
    if (node == null) {
        return 0
    }
    return depths + nodeDepths(node.left, depths + 1) + nodeDepths(node.right, depths + 1)
}
