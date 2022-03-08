import java.util.*;

class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        if (array.length < 2) {
            return new int[0];
        }
        int diff;
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int element : array) {
            diff = targetSum - element;
            if (hashTable.containsKey(diff)) {
                return new int[] { diff, element };
            }
            hashTable.put(element, diff);
        }
        return new int[0];
    }
}
