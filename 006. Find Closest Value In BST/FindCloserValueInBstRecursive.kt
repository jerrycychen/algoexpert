package com.algoexpert.program

import kotlin.math.abs

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}

fun findClosestValueInBst(tree: BST, target: Int): Int {
    return findClosestValueInBstHelper(tree, target, tree.value)
}

fun findClosestValueInBstHelper(node: BST, target: Int, closestValue: Int): Int {
    var closest = closestValue
    if (abs(target - closest) > abs(target - node.value)) {
        closest = node.value
    }
    if (target < node.value && node.left != null) {
        return findClosestValueInBstHelper(node.left!!, target, closest)
    } else if (target > node.value && node.right != null) {
        return findClosestValueInBstHelper(node.right!!, target, closest)
    } else {
        return closest
    }
}
