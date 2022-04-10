import java.util.*;

class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int leftPointer;
        int rightPointer;
        int diff;
        int len = array.length;
        List<Integer[]> res = new ArrayList<Integer[]>();

        Arrays.sort(array); // sort the array first, O(nlogn)
        // System.out.println(Arrays.toString(array));

        for (int i = 0; i < len; i++) {
            leftPointer = i + 1;
            rightPointer = len - 1;
            diff = targetSum - array[i];
            // System.out.print("diff = ");
            // System.out.println(diff);
            // System.out.println("-----");
            while (leftPointer < rightPointer) {
                if (array[leftPointer] + array[rightPointer] == diff) {
                    // System.out.printf("%d + %d == %d\n", array[leftPointer], array[rightPointer],
                    // diff);
                    // System.out.println("WRITE");
                    res.add(new Integer[] { array[i], array[leftPointer], array[rightPointer] });
                    leftPointer++;
                    rightPointer--;
                } else if (array[leftPointer] + array[rightPointer] < diff) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }
        return res;
    }
}
