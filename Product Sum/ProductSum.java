import java.util.*;

class ProductSum {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        // Write your code here.
        return productSumHelper(array, 1);
    }

    public static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object element : array) {
            if (element instanceof List) {
                @SuppressWarnings("unchecked")
                List<Object> ls = (List<Object>) element;
                sum += productSumHelper(ls, multiplier + 1);
            } else {
                sum += (int) element;
            }
        }
        return sum * multiplier;
    }
}
