import java.util.*;

class FirstDuplicateValue {

    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        HashSet<Integer> seen = new HashSet<Integer>();
        for (int num : array) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
}
