package arrays;

/*
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9

Output: [0,1]

Explanation:

The sum of nums[0] and nums[1] is 2 + 7 = 9, which equals the target. Therefore, the indices [0, 1] are returned.

Example 2:

Input: nums = [3,2,4], target = 6

Output: [1,2]

Explanation:

The sum of nums[1] and nums[2] is 2 + 4 = 6, which equals the target. Therefore, the indices [1, 2] are returned.
* */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Example driver that runs the hash map solution on a sample input.
    public static void main(String[] args) {
//        int[] arr = {2, 7, 11, 15}; int target = 9;
//        int[] arr = {3,2,4}; int target = 6;
        int[] arr = {3,3}; int target = 6;
        int[] res = twoSumHashMap(arr, target);
        System.out.println(res[0] + " " + res[1]);

    }

    /**
     * Brute-force approach: check every pair of distinct indices.
     * Time: O(n^2); extra space: O(1).
     */
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    /**
     * Hash map approach: store previously seen values and their indices,
     * then look up the complement needed for each current value.
     * Time: O(n) average; extra space: O(n).
     */
    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> indicesByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer complementIndex = indicesByValue.get(complement);
            if (complementIndex != null) {
                return new int[]{complementIndex, i};
            }
            indicesByValue.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

}
