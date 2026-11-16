package string.gpt;

public class ReverseStringWithourUsingBuildInMethods {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String str) {

//        StringBuilder builder = new StringBuilder(str);
//        builder.reverse();
//        return builder.toString();

        StringBuilder res = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--) {
            res.append(str.charAt(i));
        }

        return res.toString();
    }
}
