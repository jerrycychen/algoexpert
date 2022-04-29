package com.algoexpert.program

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null

    // Average: O(log(n)) time | O(1) space
    // Worst: O(n) time | O(1) space
    fun insert(value: Int): BST {
        var currentNode: BST? = this
        while (true) {
            if (value < currentNode!!.value) {
                if (currentNode.left == null) {
                    currentNode.left = BST(value)
                    break
                } else {
                    currentNode = currentNode.left
                }
            } else if (value > currentNode.value) {
                if (currentNode.right == null) {
                    currentNode.right = BST(value)
                    break
                } else {
                    currentNode = currentNode.right
                }
            }
        }
        return this
    }

    // Average: O(log(n)) time | O(1) space
    // Worst: O(n) time | O(1) space
    fun contains(value: Int): Boolean {
        var currentNode: BST? = this
        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.left
            } else if (value > currentNode.value) {
                currentNode = currentNode.right
            } else {
                return true
            }
        }
        return false
    }

    // Average: O(log(n)) time | O(1) space
    // Worst: O(n) time | O(1) space
    fun remove(value: Int, parent: BST? = null): BST {
        var parentNode = parent
        var currentNode: BST? = this
        while (currentNode != null) {
            if (value < currentNode.value) {
                parentNode = currentNode
                currentNode = currentNode.left
            } else if (value > currentNode.value) {
                parentNode = currentNode
                currentNode = currentNode.right
            } else {
                if (currentNode.left != null && currentNode.right != null) {
                    currentNode.value = currentNode.right!!.getMinValue()
                    currentNode.right!!.remove(currentNode.value, currentNode)
                } else if (parentNode == null) {
                    if (currentNode.left != null) {
                        currentNode.value = currentNode.left!!.value
                        currentNode.left = currentNode.left!!.left
                        currentNode.right = currentNode.left!!.right
                    } else if (currentNode.right != null) {
                        currentNode.value = currentNode.right!!.value
                        currentNode.left = currentNode.right!!.left
                        currentNode.right = currentNode.right!!.right
                    } else {
                        // This is a single-node tree; do nothing.
                    }
                } else if (parentNode.left == currentNode) {
                    parentNode.left =
                            if (currentNode.left != null) currentNode.left else currentNode.right
                } else if (parentNode.right == currentNode) {
                    parentNode.right =
                            if (currentNode.left != null) currentNode.left else currentNode.right
                }
                break
            }
        }
        return this
    }

    fun getMinValue(): Int {
        if (this.left == null) {
            return this.value
        } else {
            return this.left!!.getMinValue()
        }
    }
}
