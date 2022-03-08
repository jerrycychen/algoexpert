package com.algoexpert.program

class Node(name: String) {
    val name: String = name
    val children = mutableListOf<Node>()

    fun depthFirstSearch(): List<String> {
        // Write your code here.
        return depthFirstSearch(mutableListOf())
    }

    fun depthFirstSearch(array: MutableList<String>): List<String> {
        array.add(this.name)
        for (node in this.children) {
            node.depthFirstSearch(array)
        }
        return array
    }
}
