import java.util.*;

class FirstNonRepeatingCharacter {

    public int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> characterFrequencies = new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            characterFrequencies.put(character, characterFrequencies.getOrDefault(character, 0) + 1);
        }
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (characterFrequencies.get(character) == 1) {
                return i;
            }
        }
        return -1;
    }
}
