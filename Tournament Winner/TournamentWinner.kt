package com.algoexpert.program

fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
    var currentBestTeam = ""
    val scores = mutableMapOf(currentBestTeam to 0)

    for (i in 0 until competitions.size) {
        val competition = competitions[i]
        val result = results[i]
        val (homeTeam, awayTeam) = competition
        val winningTeam = if (result == 1) homeTeam else awayTeam
        if (!(winningTeam in scores)) scores[winningTeam] = 0
        scores[winningTeam] = scores[winningTeam]!! + 1
        if (scores[winningTeam]!! > scores[currentBestTeam]!!) currentBestTeam = winningTeam
    }
    return currentBestTeam
}
