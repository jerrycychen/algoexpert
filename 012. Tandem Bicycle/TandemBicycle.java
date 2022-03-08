import java.util.*;

class TandemBicycle {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        int size = redShirtSpeeds.length;
        int sum = 0;
        if (size == 1)
            return Math.max(redShirtSpeeds[0], blueShirtSpeeds[0]);
        Arrays.sort(redShirtSpeeds);
        if (fastest == false) {
            redShirtSpeeds = reverseArray(redShirtSpeeds, size);
        }
        Arrays.sort(blueShirtSpeeds);
        blueShirtSpeeds = reverseArray(blueShirtSpeeds, size);
        for (int i = 0; i < size; i++) {
            sum += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
        }
        return sum;
    }

    public int[] reverseArray(int[] array, int size) {
        int reversed[] = new int[size];
        for (int i = size - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element);
        }
        System.out.println();
    }
}
