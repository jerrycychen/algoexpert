import java.util.*;

class NthFibonacciOnO1 {
    public static int getNthFib(int n) {
        int[] base = { 0, 1 };
        int counter = 3;
        while (counter <= n) {
            int nextFib = base[0] + base[1];
            base[0] = base[1];
            base[1] = nextFib;
            counter++;
        }
        return n > 1 ? base[1] : base[0];
    }
}
