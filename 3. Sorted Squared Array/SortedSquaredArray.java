import java.util.*;
import java.lang.Math.*;

class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        int i = 0; // head of array
        int j = array.length - 1; // tail of array
        int[] res = new int[array.length];
        int k = res.length - 1; // tail of res

        while (true) {
            // boundary check
            if (i == j) {
                // if iterating to last item, assign, break, then return
                res[k] = array[i] * array[i];
                break;
            }
            if (Math.abs(array[i]) >= Math.abs(array[j])) {
                // if head > tail
                res[k] = array[i] * array[i];
                i++;
                k--;
            } else if (Math.abs(array[i]) < Math.abs(array[j])) {
                // if head < tail
                res[k] = array[j] * array[j];
                j--;
                k--;
            }
        }
        return res;
    }
}
