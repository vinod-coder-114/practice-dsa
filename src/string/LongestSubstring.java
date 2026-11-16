package string;

import java.util.HashSet;
import java.util.Set;

/*
3. Longest Substring Without Repeating Characters -> Medium
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew" -> [p,w,w,k,e,w]
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(solveWithBruteForce("pwwkew"));
        System.out.println(solveWithBruteForce("bbbb"));
    }

    public static int solveWithBruteForce(String s) {
        Set<Character> characterSet = new HashSet<>();
        int longestLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!characterSet.contains(s.charAt(i))) {
                characterSet.add(s.charAt(i));
            } else {
                longestLength = characterSet.size();
                characterSet.clear();
            }

        }
        return characterSet.size();
    }

    /*
     * Brute-force approach:
     * 1. Treat each position in the string as the start of a candidate substring.
     * 2. Extend the candidate one character at a time, keeping track of characters
     *    already included in that candidate.
     * 3. If the next character is already present, stop extending from this start,
     *    because any longer candidate from the same start would still contain it.
     * 4. For every candidate with no repeated characters, update the maximum length.
     * 5. Return the maximum length found.
     * Time: O(n^2) average with a set; extra space: O(min(n, character-set size)).
     *
     * Efficient approach (sliding window):
     * 1. Keep a window of unique characters using a left boundary and a right boundary.
     * 2. Move the right boundary through the string, recording each character's
     *    most recent index in a map.
     * 3. When the current character was already seen inside the window, move the
     *    left boundary to one position after its previous index. Never move the
     *    left boundary backward.
     * 4. After each step, the window contains no duplicates; update the maximum
     *    length using the current window size.
     * 5. Return the maximum length after the scan.
     * Time: O(n) average; extra space: O(min(n, character-set size)).
     */
}
