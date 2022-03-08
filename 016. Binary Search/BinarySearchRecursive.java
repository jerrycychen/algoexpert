import java.util.*;

class BinarySearchRecursive {
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        return binarySearch(array, target, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int pivot = (left + right) / 2;
        if (array[pivot] == target) {
            return pivot;
        } else if (target > array[pivot]) {
            return binarySearch(array, target, pivot + 1, right);
        } else {
            return binarySearch(array, target, left, pivot - 1);
        }
    }
}