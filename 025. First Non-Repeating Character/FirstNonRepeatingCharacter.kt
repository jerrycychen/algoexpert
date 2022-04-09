package com.algoexpert.program

fun firstNonRepeatingCharacter(string: String): Int {
    val characterFrequencies = mutableMapOf<Char, Int>()
    for (char in string) {
        if (!(char in characterFrequencies)) characterFrequencies[char] = 0
        characterFrequencies[char] = characterFrequencies[char]!! + 1
    }
    for (i in 0 until string.length) {
        val char = string[i]
        if (characterFrequencies[char] == 1) {
            return i
        }
    }
    return -1
}
