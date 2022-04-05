package com.algoexpert.program

fun PalindromeCheckOnOnRecursive(string: String): Boolean {
    return isPalindrome(string, 0)
}

fun isPalindrome(str: String, i: Int): Boolean {
    val j = str.length - 1 - i
    return if (i >= j) true else str.get(i) == str.get(j) && isPalindrome(str, i + 1)
}
