import java.util.*;

class BinarySearchIterative {
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        return binarySearch(array, target, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        int pivot;
        while (left <= right) {
            pivot = (left + right) / 2;
            if (array[pivot] == target) {
                return pivot;
            } else if (array[pivot] < target) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return -1;
    }
}
