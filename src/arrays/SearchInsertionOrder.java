package arrays;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertionOrder {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsertionOrderIndex(nums, target));
    }
     public static int searchInsertionOrderIndex(int[] nums, int target) {
        int n = nums.length;
        // this can be implemented using binary search
         int left = 0;
         int right = nums.length;
         while (left < right) {
             int mid = (left + right) / 2;
             if (target > nums[mid]) {
                 left = mid + 1;
             } else {
                 right = mid;
             }

         }
         return left;
     }
}
