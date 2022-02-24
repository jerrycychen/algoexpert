import java.util.*;

class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
        int currentChange = 0;
        for (int coin : coins) {
            if (coin > currentChange + 1) {
                return currentChange + 1;
            }
            currentChange += coin;
        }
        return currentChange + 1;
    }
}
