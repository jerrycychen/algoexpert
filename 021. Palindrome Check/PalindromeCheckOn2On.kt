package com.algoexpert.program

fun PalindromeCheckOn2On(string: String): Boolean {
    var reversedString = ""
    for (i in string.length - 1 downTo 0) {
        reversedString += string[i]
    }
    return string == reversedString
}
