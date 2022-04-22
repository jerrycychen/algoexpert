package com.algoexpert.program

// O(n) time | O(n) space - where n is the total number of elements in the array and
fun spiralTraverse(array: List<List<Int>>): List<Int> {
    if (array.size == 0) return mutableListOf<Int>()

    val result = mutableListOf<Int>()
    var startRow = 0
    var endRow = array.size - 1
    var startCol = 0
    var endCol = array[0].size - 1

    while (startRow <= endRow && startCol <= endCol) {
        for (col in startCol..endCol) {
            result.add(array[startRow][col])
        }
        for (row in startRow + 1..endRow) {
            result.add(array[row][endCol])
        }
        for (col in endCol - 1 downTo startCol) {
            if (startRow == endRow) break
            result.add(array[endRow][col])
        }
        for (row in endRow - 1 downTo startRow + 1) {
            if (startCol == endCol) break
            result.add(array[row][startCol])
        }
        startRow++
        endRow--
        startCol++
        endCol--
    }
    return result
}
