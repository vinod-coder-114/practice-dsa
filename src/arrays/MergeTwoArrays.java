package arrays;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 * <p>
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * Example 3:
 * <p>
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 */
public class MergeTwoArrays {

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3, n = 3;
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        merge(nums1, m, nums2, n);
    }

    /*
     * Approach:
     * nums1 already has enough space at the end to hold all elements from nums2.
     * To avoid overwriting the valid elements in nums1, merge the arrays from right
     * to left:
     *
     * 1. Set one pointer to the last valid element of nums1 (m - 1), one to the
     *    last element of nums2 (n - 1), and one to the last position in nums1
     *    (m + n - 1).
     * 2. Compare the values at the first two pointers and place the larger value
     *    at the position indicated by the third pointer.
     * 3. Move the pointer whose value was copied one position to the left, and
     *    move the destination pointer one position to the left.
     * 4. Continue until all elements from nums2 have been copied. Any remaining
     *    elements in nums1 are already in their correct positions.
     *
     * This also handles m == 0: all elements from nums2 are copied into nums1.
     *
     * Time Complexity: O(m + n)
     * Space Complexity: O(1) extra space
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //Input:  nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        //Output: [1,2,2,3,5,6]
        int i = m - 1;
        int j = n - 1;
        int k = (m + n - 1);
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        System.out.println(Arrays.toString(nums1));

    }
}
