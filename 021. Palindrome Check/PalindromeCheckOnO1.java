import java.util.*;

class PalindromeCheckOnO1 {
    public static boolean isPalindrome(String str) {
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
