package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * <p>
 * Output: 4
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumber {

    public static void main(String[] args) {
//        int[] nums = {4,1,2,1,2};
//        int[] nums = {2};
        int[] nums = {2,2,1};
//        System.out.println(singleNumber(nums));
        System.out.println(singleNumberUsingXor(nums));
    }
    public static int singleNumber(int[] nums) {
        // nums = [4,1,2,1,2], 4 is unique element
        // Approach 1 : using stream
        Map.Entry<Integer, Long> integerLongEntry = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(n -> n, HashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElseThrow();
        return integerLongEntry.getKey();
    }

    public static int singleNumberUsingXor(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result = result ^ n;
        }
        return result;
    }
}
