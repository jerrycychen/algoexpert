import java.util.*;

class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int indexOne = 0;
        int indexTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
            int firstNum = arrayOne[indexOne];
            int secondNum = arrayTwo[indexTwo];
            if (firstNum < secondNum) {
                current = secondNum - firstNum;
                indexOne++;
            } else if (secondNum < firstNum) {
                current = firstNum - secondNum;
                indexTwo++;
            } else {
                return new int[] { firstNum, secondNum };
            }
            if (smallest > current) {
                smallest = current;
                smallestPair = new int[] { firstNum, secondNum };
            }
        }
        return smallestPair;
    }
}