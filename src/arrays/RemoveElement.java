package arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_] <br/>
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores). <br/>
 * Example 2:
 * <p>
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2 <br/>
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement {

    public static void main(String[] args) {
//        int[] nums = {3, 2, 2, 3};
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeDuplicates(nums, val));
        for (int i : nums)
            System.out.print(i + ",");
    }
    /**
     * Write the code yourself using this approach:
     *
     * Approach (Two Pointers / In-place overwrite):
     * 1. Use a pointer 'k' to track the position where the next valid element should be written.
     * 2. Traverse the array with another pointer 'i' from start to end.
     * 3. If nums[i] is not equal to val, then it is a value that should stay in the result.
     * 4. Copy nums[i] into nums[k], then increase k by 1.
     * 5. Skip all elements equal to val.
     * 6. At the end, return k, which is the count of valid elements.
     *
     * Why this works:
     * - We keep the valid elements together at the front of the array.
     * - Elements equal to val are ignored and overwritten naturally.
     * - The order of remaining elements can change, which is allowed by the problem.
     *
     * Example:
     * nums = [3, 2, 2, 3], val = 3
     * valid elements are [2, 2]
     * final output: k = 2 and first 2 positions contain 2, 2
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int removeDuplicates(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
