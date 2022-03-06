import java.util.*;

class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int i = 0;
        int j = 0;
        while (true) {
            // if array or sequence only has 1 element (left)
            if (i == array.size() || j == sequence.size()) {
                break;
            }
            // when the number of array at index i IS THE SAME AS the number of sequence at
            // index j
            if (array.get(i) == sequence.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == sequence.size() ? true : false;
    }
}
