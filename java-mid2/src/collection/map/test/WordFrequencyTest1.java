package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple banana apple";
        String[] arr = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String key : arr) {
            Integer count = map.get(key);
            if (count == null) {
                map.put(key, 1);
            } else {
                count++;
                map.put(key, count);
            }
        }
        System.out.println(map);
    }
}
