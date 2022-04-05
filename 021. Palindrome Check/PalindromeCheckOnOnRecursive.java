import java.util.*;

class PalindromeCheckOnOnRecursive {
    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0);
    }

    public static boolean isPalindrome(String str, int i) {
        int j = str.length() - 1 - i;
        return i >= j ? true : str.charAt(i) == str.charAt(j) && isPalindrome(str, i + 1);
    }
}
