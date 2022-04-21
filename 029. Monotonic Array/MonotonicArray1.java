import java.util.*;

class Program {
    public static boolean isMonotonic(int[] array) {
        if (array.length <= 2)
            return true;

        var direction = array[1] - array[0];
        for (int i = 2; i < array.length; i++) {
            if (direction == 0) {
                direction = array[i] - array[i - 1];
                continue;
            }
            if (breaksDirection(direction, array[i - 1], array[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean breaksDirection(int direction, int previous, int current) {
        var difference = current - previous;
        if (direction > 0)
            return difference < 0;
        return difference > 0;
    }
}