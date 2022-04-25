package com.algoexpert.program

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null

    // Average: O(log(n)) time | O(log(n)) space
    // Worst: O(n) time | O(n) space
    fun insert(value: Int): BST {
        if (value < this.value) {
            if (this.left == null) {
                this.left = BST(value)
            } else {
                this.left!!.insert(value)
            }
        } else {
            if (this.right == null) {
                this.right = BST(value)
            } else {
                this.right!!.insert(value)
            }
        }
        return this
    }

    // Average: O(log(n)) time | O(log(n)) space
    // Worst: O(n) time | O(n) space
    fun contains(value: Int): Boolean {
        if (value < this.value) {
            if (this.left == null) {
                return false
            } else {
                this.left!!.contains(value)
            }
        } else if (value > this.value) {
            if (this.right == null) {
                return false
            } else {
                this.right!!.contains(value)
            }
        } else {
            return true
        }
    }

    // Average: O(log(n)) time | O(log(n)) space
    // Worst: O(n) time | O(n) space
    fun remove(value: Int, parent: BST?): BST {
        if (value < this.value) {
            if (this.left != null) {
                this.left!!.remove(value, this)
            }
        } else if (value > this.value) {
            if (this.right != null) {
                this.right!!.remove(value, this)
            }
        } else {
            if (this.left != null && this.right != null) {
                this.value = this.right!!.getMinValue()
                this.right!!.remove(this.value, this)
            } else if (parent == null) {
                if (this.left != null) {
                    this.value = this.left!!.value
                    this.right = this.left!!.right
                    this.left = this.left!!.left
                } else if (this.right != null) {
                    this.value = this.right!!.value
                    this.left = this.right!!.left
                    this.right = this.right!!.right
                } else {
                    // This is a single-node tree; do nothing.
                }
            } else if (parent.left == this) {
                parent.left = if (this.left != null) this.left else this.right
            } else if (parent.right == this) {
                parent.right = if (this.right != null) this.left else this.right
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
