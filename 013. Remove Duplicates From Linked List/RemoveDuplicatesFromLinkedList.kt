package com.algoexpert.program

// This is an input class. Do not edit.
open class LinkedList(value: Int) {
    var value = value
    var next: LinkedList? = null
}

fun removeDuplicatesFromLinkedList(linkedList: LinkedList): LinkedList {
    var currentNode: LinkedList? = linkedList
    while (currentNode != null) {
        var nextDistinctNode = currentNode.next
        while (nextDistinctNode != null && nextDistinctNode.value == currentNode.value) {
            nextDistinctNode = nextDistinctNode.next
        }
        currentNode.next = nextDistinctNode
        currentNode = nextDistinctNode
    }
    return linkedList
}
