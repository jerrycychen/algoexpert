package com.algoexpert.program

fun generateDocument(characters: String, document: String): Boolean {
    val characterCounts = mutableMapOf<Char, Int>()

    for (char in characters) {
        if (!(char in characterCounts)) characterCounts[char] = 0
        characterCounts[char] = characterCounts[char]!! + 1
    }

    for (char in document) {
        if (!(char in characterCounts) || characterCounts[char] == 0) return false
        characterCounts[char] = characterCounts[char]!! - 1
    }

    return true
}
