package string.gpt;

import java.util.HashSet;
import java.util.Set;

public class FindFirstNonRepeatingChars {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(findFirstNonRepeatingChars(input));
    }

    public static String findFirstNonRepeatingChars(String input) {
        Set<Character> charSet = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!charSet.add(input.charAt(i)))
                return res.toString();

            res.append(input.charAt(i));
        }
        return res.toString();
    }
}
