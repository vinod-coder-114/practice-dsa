package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * The element 1 occurs at the indices 0 and 3.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * All elements are distinct.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * <p>
 * Output: true
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
//        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        int[] nums = {1,2,3,7,7};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateUsingSet(nums));
    }
     public static boolean containsDuplicate(int[] nums) {
         Map<Integer, Integer> intCount = new HashMap<>();
         boolean doesContains = false;
         for (int num : nums) {
             intCount.put(num, intCount.getOrDefault(num, 0) + 1);
         }
         for (Map.Entry<Integer, Integer> entry : intCount.entrySet()) {
             doesContains = entry.getValue() > 1;
             if (doesContains)
                 return doesContains;
         }

        return false;
     }

     public static boolean containsDuplicateUsingSet(int[] nums) {
         Set<Integer> seen = new HashSet<>();
         for (int num : nums) {
             if (!seen.add(num)) {
                 return true;
             }
         }
        return false;
     }
}
