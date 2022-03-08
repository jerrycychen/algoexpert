import java.util.*;

class TournamentWinner {

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        int i = 0;
        String res = "";
        String winningTeam = "";
        Map<String, Integer> resmap = new HashMap<String, Integer>();
        for (ArrayList<String> teams : competitions) {
            winningTeam = (results.get(i) == 0) ? teams.get(1) : teams.get(0);
            if (!resmap.containsKey(winningTeam)) { // if the winning team name is not yet in the map
                resmap.put(winningTeam, 1); // put the winning team into the map as key, and set value = 1
                if (res == "") { // if res is "", directly update the current iterated winning team as res
                    res = winningTeam;
                } else if (resmap.containsKey(res) && resmap.get(res) < resmap.get(winningTeam)) {
                    res = winningTeam;
                }
            } else { // if the winning team is already in the map
                resmap.put(winningTeam, resmap.get(winningTeam) + 1); // winning team value++
                if (resmap.containsKey(res) && resmap.get(res) < resmap.get(winningTeam)) { //
                    res = winningTeam;
                }
            }
            i++;
        }
        return res;
    }
}
