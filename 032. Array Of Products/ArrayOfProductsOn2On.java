import java.util.*;

class Program {

    // O(n^2) time | O(n) space - where n is the length of the input array
    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int runningProduct = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j)
                    runningProduct *= array[j];
            }
            products[i] = runningProduct;
        }
        return products;
    }
}