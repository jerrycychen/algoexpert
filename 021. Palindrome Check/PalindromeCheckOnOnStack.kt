package com.algoexpert.program

import java.util.ArrayDeque

fun PalindromeCheckOnOnStack(string: String): Boolean {
    val length = string.length
    if (length == 0) {
        return false
    } else if (length == 1) {
        return true
    }

    var currentChar: Char
    val isOdd: Boolean = if (length % 2 == 0) false else true
    var stack = ArrayDeque<Char>()
    for (i in 0 until length) {
        if (isOdd) {
            if (i == length / 2) {
                // when current index is the centre pivot
                continue
            } else if (i < length / 2) {
                stack.push(string.get(i))
            } else {
                currentChar = stack.pop()
                if (currentChar != string.get(i)) {
                    return false
                }
            }
        } else {
            if (i < length / 2) {
                stack.push(string.get(i))
            } else {
                currentChar = stack.pop()
                if (currentChar != string.get(i)) {
                    return false
                }
            }
        }
    }
    return if (stack.size == 0) true else false
}
