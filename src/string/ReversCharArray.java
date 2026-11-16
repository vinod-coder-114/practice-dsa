package string;

public class ReversCharArray {

    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] reversed = reverseCharArray(input);
        System.out.println(reversed);
    }

    public static char[] reverseCharArray(char[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            char temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        return input;
    }
}
