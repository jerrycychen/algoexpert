package com.algoexpert.program

import kotlin.math.abs

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}

fun findClosestValueInBst(tree: BST, target: Int): Int {
    return findClosestValueInBst(tree, target, tree.value)
}

fun findClosestValueInBst(tree: BST?, target: Int, closestValue: Int): Int {
    var closest = closestValue
    var node = tree
    while (node != null) {
        if (abs(target - closest) > abs(target - node.value)) {
            closest = node.value
        }
        if (target < node.value) {
            node = node.left
        } else if (target > node.value) {
            node = node.right
        } else {
            break
        }
    }
    return closest
}
