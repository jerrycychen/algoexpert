import java.util.*;

class RunLengthEncoding {
    public String runLengthEncoding(String string) {
        int currentRunLength = 1;
        StringBuilder encodedString = new StringBuilder();
        char currentChar = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if ((string.charAt(i) != currentChar) || (currentRunLength == 9)) {
                encodedString.append(currentRunLength);
                encodedString.append(currentChar);
                currentRunLength = 0;
                currentChar = string.charAt(i);
            }
            currentRunLength++;
        }
        encodedString.append(currentRunLength);
        encodedString.append(string.charAt(string.length() - 1));
        return encodedString.toString();
    }
}
