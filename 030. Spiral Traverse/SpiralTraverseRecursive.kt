package com.algoexpert.program

// O(n) time | O(n) space - where n is the total number of elements in the array
fun spiralTraverse(array: List<List<Int>>): List<Int> {
    if (array.size == 0) return mutableListOf<Int>()

    var result = mutableListOf<Int>()
    spiralFill(array, 0, array.size - 1, 0, array[0].size - 1, result)
    return result
}

fun spiralFill(
        array: List<List<Int>>,
        startRow: Int,
        endRow: Int,
        startCol: Int,
        endCol: Int,
        result: MutableList<Int>
) {
    if (startRow > endRow || startCol > endCol) return

    for (col in startCol..endCol) result.add(array[startRow][col])
    for (row in startRow + 1..endRow) result.add(array[row][endCol])
    for (col in endCol - 1 downTo startCol) {
        if (startRow == endRow) break
        result.add(array[endRow][col])
    }
    for (row in endRow - 1 downTo startRow + 1) {
        if (startCol == endCol) break
        result.add(array[row][startCol])
    }
    spiralFill(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result)
}
