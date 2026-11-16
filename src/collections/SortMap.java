package collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortMap {
    public static void main(String[] args) {
        HashMap<Integer, String> inputMap = new HashMap<>();
        inputMap.put(8, "Vinod");
        inputMap.put(2, "Kiran");
        inputMap.put(9,"Vijay");
        System.out.println(inputMap);
//        sortAMap(inputMap);

        int[] arr = {2,8,1,3,9};
        getSecondLargestElement(arr);
    }

    /**
     * Sort the Map Ascending or Descending order
     * @param inputMap -> contains the input
     * @return -> Result Map
     */
    public static Map<Integer, String> sortAMap(Map<Integer, String> inputMap) {
        System.out.println(inputMap);
        TreeMap<Integer, String> intTreeMap = new TreeMap<>(inputMap);
        System.out.println(intTreeMap);
        Map<Integer, String> result = inputMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (prev, next) -> prev, LinkedHashMap::new));
        System.out.println(result);

        return result;
    }

    public static int[] getSecondLargestElement(int[] input) {
        Integer val =  Arrays.stream(input)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(val);
        return null;
    }
}
