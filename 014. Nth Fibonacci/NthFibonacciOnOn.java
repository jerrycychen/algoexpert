import java.util.*;

class NthFibonacciOnOn {
    public static int getNthFib(int n) {
        Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
        memo.put(1, 0);
        memo.put(2, 1);
        return getNthFib(n, memo);
    }

    public static int getNthFib(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            memo.put(n, getNthFib(n - 1, memo) + getNthFib(n - 2, memo));
            return memo.get(n);
        }
    }
}
