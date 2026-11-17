package arrays;

import java.security.PublicKey;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * Example 3:
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */
/*
 * Approach we follow:
 * 1. Traverse the array from right to left because adding 1 affects the last digit first.
 * 2. If the current digit is less than 9, increment it and return the updated array immediately.
 * 3. If the current digit is 9, set it to 0 and continue the loop to propagate the carry.
 * 4. If all digits are 9, create a new array with one extra space and place 1 at the front.
 *
 * Example: [9, 9, 9] -> [1, 0, 0, 0]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) extra space (or O(n) when a new array is created for the carry case)
 */
public class PlusOne {


    public static void main(String[] args) {
//        int[] digits = {1, 2, 3};
        int[] digits = {0};
        System.out.println(java.util.Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }


}
