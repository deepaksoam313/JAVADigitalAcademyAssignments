package problem8;

import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(3, "Deepak");
        hashMap.put(1, "Ravi");
        hashMap.put(4, "Aadarsh");
        hashMap.put(2, "Manish");

        System.out.println("Original HashMap: " + hashMap);

        // Sort and print HashMap in ascending order by keys
        TreeMap<Integer, String> sortedAscByKey = new TreeMap<>(hashMap);
        System.out.println("Sorted HashMap by keys (Ascending): " + sortedAscByKey);

        // Sort and print HashMap in descending order by keys
        TreeMap<Integer, String> sortedDescByKey = new TreeMap<>(Collections.reverseOrder());
        sortedDescByKey.putAll(hashMap);
        System.out.println("Sorted HashMap by keys (Descending): " + sortedDescByKey);

        // Sort and print HashMap by values
        List<Map.Entry<Integer, String>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);

        HashMap<Integer, String> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted HashMap by values: " + sortedByValue);
    }
}
