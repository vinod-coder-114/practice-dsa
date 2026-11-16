package string;

import java.util.*;

public class FindAnagramAndRemove {
    public static void main(String[] args) {
        String[] input = {"car", "race", "dore", "bat", "tab", "coder"};
        System.out.println(findAnagramAndRemoveDuplicate(input));
    }

    public static List<String> findAnagramAndRemoveDuplicate(String[] input) {
        String[] words = input;
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            if (seen.add(sortedStr))
                result.add(word);
        }
        return result;
    }
}

