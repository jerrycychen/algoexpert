package com.algoexpert.program

fun caesarCipherEncryptor(string: String, key: Int): String {
    val newLetters = mutableListOf<Char>()
    val newKey = key % 26
    for (letter in string) {
        newLetters.add(getNewLetter(letter, newKey))
    }
    return newLetters.joinToString("")
}

fun getNewLetter(letter: Char, key: Int): Char {
    val newLetterCode = letter.toInt() + key
    return if (newLetterCode <= 122) newLetterCode.toChar() else (96 + newLetterCode % 122).toChar()
}
