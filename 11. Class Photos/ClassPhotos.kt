package com.algoexpert.program

fun classPhotos(redShirtHeights: MutableList<Int>, blueShirtHeights: MutableList<Int>): Boolean {
    var redFront: Boolean = false
    redShirtHeights.sort()
    blueShirtHeights.sort()
    if (redShirtHeights.last() < blueShirtHeights.last()) {
        redFront = true
    } else if (redShirtHeights.last() > blueShirtHeights.last()) {
        redFront = false
    } else {
        return false
    }
    redShirtHeights.forEachIndexed { i, redShirtHeight ->
        if (redFront == true) {
            if (redShirtHeight >= blueShirtHeights[i]) {
                return false
            }
        } else {
            if (redShirtHeight <= blueShirtHeights[i]) {
                return false
            }
        }
    }
    return true
}
