package arrays;

import java.util.Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,7,3,9,0,8,8,9,9};
        System.out.println(findSecondLargestElementFromArray(arr));
    }
    public static int findSecondLargestElementFromArray(int[] arr) {
        int largest = 0;
        int secondLargest = 0;
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (secondLargest < j && largest > j) {
                secondLargest = j;
            }
        }

        return secondLargest;
    }

    public static int findSecondLargestElementFromArrayUsingStream(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(arr.length - 2)
                .findFirst()
                .orElse(0);

    }
}
