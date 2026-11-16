package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateNumberIndexes {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(1,3,2,3,1));
        List<int[]> result = findDuplicateIndexes(input);
        result.forEach(arr -> System.out.println(Arrays.toString(arr)));
    }

    public static List<int[]> findDuplicateIndexes(List<Integer> input) {
        List<int[]> result = input.stream()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .flatMap(entry ->
                        IntStream.range(0, entry.getValue().intValue() / 2)
                                .mapToObj(i -> new int[]{
                                        entry.getKey(), entry.getKey()
                                })
                ).collect(Collectors.toList());

        return result;
    }
}
