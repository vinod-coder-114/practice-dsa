package string;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringInSortedOrder {

    public static void main(String[] args) {
        System.out.println(reverseStringInSortedOrder("debac"));
    }

    public static String reverseStringInSortedOrder(String str) {
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

    }
}
