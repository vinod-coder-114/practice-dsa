package arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3};
        int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + ",");
        }
    }

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
