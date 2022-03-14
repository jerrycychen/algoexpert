package com.algoexpert.program

fun getNthFib(n: Int): Int {
    val memo = mutableMapOf<Int, Int>(1 to 0, 2 to 1)
    return getNthFib(n, memo)
}

fun getNthFib(n: Int, memo: MutableMap<Int, Int>): Int {
    if (memo.containsKey(n)) {
        return memo.get(n)!!
    } else {
        memo.put(n, getNthFib(n - 1, memo) + getNthFib(n - 2, memo))
        return memo.get(n)!!
    }
}
