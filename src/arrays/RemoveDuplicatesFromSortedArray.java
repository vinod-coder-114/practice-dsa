package arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3};
        int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    /**
     * Approach:
     * 1. Keep a pointer 'k' that represents the index of the last unique element.
     * 2. Traverse the array from the second element using pointer 'i'.
     * 3. If arr[i] is different from arr[k], it means a new unique value is found.
     * 4. Move 'k' forward and place arr[i] in the next unique position.
     * 5. Repeat until the array is fully scanned.
     * 6. Return the count of unique elements, which is k + 1.
     *
     * This is a standard in-place two-pointer approach.
     * - 'k' tracks the unique section of the array.
     * - 'i' scans the remaining elements.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * Example:
     * Input: [1, 1, 2, 2, 2, 3]
     * Output: 3 unique elements -> [1, 2, 3]
     */
    public static int removeDuplicates(int[] arr) {
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[k] != arr[i]) {
                k++;
                arr[k] = arr[i];
            }
        }
        return k + 1;
    }
}
