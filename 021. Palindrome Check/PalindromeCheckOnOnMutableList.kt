package com.algoexpert.program

fun PalindromeCheckOnOnMutableList(string: String): Boolean {
    val reversedChars = mutableListOf<Char>()
    for (i in string.length - 1 downTo 0) {
        reversedChars.add(string[i])
    }
    return string == reversedChars.joinToString("")
}
