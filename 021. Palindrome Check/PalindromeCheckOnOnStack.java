import java.util.*;

class PalindromeCheckOnOnStack {
    public static boolean isPalindrome(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        } else if (length == 1) {
            return true;
        }

        char currentChar;
        boolean isOdd = (length % 2 == 0) ? false : true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < length; i++) {
            if (isOdd) {
                if (i == length / 2) {
                    // when current index is the centre pivot
                    continue;
                } else if (i < length / 2) {
                    stack.push(str.charAt(i));
                } else {
                    currentChar = stack.pop();
                    if (currentChar != str.charAt(i)) {
                        return false;
                    }
                }
            } else if (!isOdd) {
                if (i < length / 2) {
                    stack.push(str.charAt(i));
                } else {
                    currentChar = stack.pop();
                    if (currentChar != str.charAt(i)) {
                        return false;
                    }
                }
            }
        }
        return (stack.size() == 0) ? true : false;
    }
}
