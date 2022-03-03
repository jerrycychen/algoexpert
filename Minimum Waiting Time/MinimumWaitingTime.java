import java.util.*;

class MinimumWaitingTime {

    public int minimumWaitingTime(int[] queries) {
        if (queries.length == 1)
            return 0;
        int totalWaitTime = 0;
        int currentWaitTime = 0;
        Arrays.sort(queries);
        for (int i = 1; i < queries.length; i++) {
            currentWaitTime += queries[i - 1];
            totalWaitTime += currentWaitTime;
        }
        return totalWaitTime;
    }
}
