import java.util.*;

class SelectionSort {
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;

        int smallestIndex;
        for (int i = 0; i < array.length - 1; i++) {
            smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            if (array[smallestIndex] != array[i]) {
                swap(i, smallestIndex, array);
            }
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
