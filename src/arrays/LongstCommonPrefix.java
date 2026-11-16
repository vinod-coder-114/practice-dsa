package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 */
public class LongstCommonPrefix {

    public static void main(String[] args) {
        LongstCommonPrefix longstCommonPrefix = new LongstCommonPrefix();
        String[] strs = {"flow", "flower", "flight"};
//        String[] strs = {"dog", "car", "racecar"};
        System.out.println(longstCommonPrefix.findLongestCommonPrefix(strs));
    }


    /**
     * Approach:
     * 1. If the array is null or empty, return an empty string.
     * 2. Start with the first string as the initial prefix.
     * 3. Compare this prefix with each next string in the array.
     * 4. If a string does not start with the current prefix,
     * shorten the prefix by removing the last character.
     * 5. Continue until the prefix matches or becomes empty.
     * 6. Return the prefix after checking all strings.
     * <p>
     * Example:
     * Input: ["flower", "flow", "flight"]
     * Output: "fl"
     */
    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String currentStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(currentStr)) {
                currentStr = currentStr.substring(0, currentStr.length() - 1);
                if (currentStr.isEmpty()) {
                    return "";
                }
            }
        }
        return currentStr;
    }

}
