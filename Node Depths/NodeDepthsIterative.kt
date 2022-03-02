package com.algoexpert.program

import java.util.ArrayDeque

open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

open class Level(node: BinaryTree?, depth: Int) {
    var node = node
    var depth = depth
}

fun nodeDepths(root: BinaryTree): Int {
    var depthSum = 0
    var stack = ArrayDeque<Level>()
    stack.push(Level(root, 0))
    while (stack.size > 0) {
        var top = stack.pop()
        var node = top.node
        var depth = top.depth
        if (node == null) continue
        depthSum += depth
        stack.push(Level(node.left, depth + 1))
        stack.push(Level(node.right, depth + 1))
    }
    return depthSum
}
