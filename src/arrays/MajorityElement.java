package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 * The input is generated such that a majority element will exist in the array.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElementUsingStream(nums));
        System.out.println(majorityElement(nums));
    }

    public static int majorityElementUsingStream(int[] nums) {
        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(n -> n, HashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(entry -> Math.toIntExact(entry.getValue())))
                .get()
                .getKey();
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0)
                candidate = num;
            count = (candidate == num) ? count+1 : count-1;
        }
        return candidate;
    }
}
