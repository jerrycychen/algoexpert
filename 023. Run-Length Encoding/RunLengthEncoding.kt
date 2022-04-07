package com.algoexpert.program

fun runLengthEncoding(string: String): String {
    var currentRunLength = 1
    val encodedString = mutableListOf<Char>()
    var currentChar = string[0]
    for (i in 1 until string.length) {
        if ((string[i] != currentChar) || (currentRunLength == 9)) {
            encodedString.add(currentRunLength.toString()[0])
            encodedString.add(currentChar)
            currentRunLength = 0
            currentChar = string[i]
        }
        currentRunLength++
    }
    encodedString.add(currentRunLength.toString()[0])
    encodedString.add(string[string.length - 1])
    return encodedString.joinToString("")
}
