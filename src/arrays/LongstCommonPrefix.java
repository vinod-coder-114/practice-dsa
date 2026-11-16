package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *  Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
* */
public class LongstCommonPrefix {

    public static void main(String[] args) {
        LongstCommonPrefix longstCommonPrefix = new LongstCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        longstCommonPrefix.findLongestCommonPrefix(strs);
    }

    public static String findLongestCommonPrefix(String[] strs) {
        int right = strs.length-1;
        int left = 0;
        String s1 = "flower";
        String s2 = "flow";
        if (s1.length() > s2.length()) {
            String substring = s1.substring(0, s2.length());
            System.out.println(substring);


        }
//        while (left < right) {
//
//        }
        return "";
    }
}
