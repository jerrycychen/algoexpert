import java.util.*;

class Program {

    // O(n) time | O(1) space - where n is the length of the input array
    public static int longestPeak(int[] array) {
        int longestPeakLength = 0;
        int i = 1;
        while (i < array.length - 1) {
            boolean isPeak = array[i - 1] < array[i] && array[i] > array[i + 1];
            if (!isPeak) {
                i++;
                continue;
            }

            int leftIndex = i - 2;
            while (leftIndex >= 0 && array[leftIndex + 1] > array[leftIndex]) {
                leftIndex--;
            }

            int rightIndex = i + 2;
            while (rightIndex < array.length && array[rightIndex] < array[rightIndex - 1]) {
                rightIndex++;
            }

            int currentPeakLength = rightIndex - leftIndex - 1;
            if (currentPeakLength < longestPeakLength) {
                longestPeakLength = currentPeakLength;
            }
            i = rightIndex;
        }
        return longestPeakLength;
    }
}