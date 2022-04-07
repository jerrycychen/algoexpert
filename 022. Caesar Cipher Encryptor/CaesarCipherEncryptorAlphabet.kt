package com.algoexpert.program

fun caesarCipherEncryptor(string: String, key: Int): String {
    val newLetters = mutableListOf<Char>()
    val newKey = key % 26
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    for (letter in string) {
        newLetters.add(getNewLetter(letter, newKey, alphabet))
    }
    return newLetters.joinToString("")
}

fun getNewLetter(letter: Char, key: Int, alphabet: String): Char {
    val newLetterCode = alphabet.indexOf(letter) + key
    return alphabet[newLetterCode % 26]
}
