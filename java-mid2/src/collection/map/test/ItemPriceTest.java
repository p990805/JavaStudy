package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        for(String name : map.keySet()) {
            if(map.get(name) == 1000) {
                arr.add(name);
            }
        }
        System.out.println(arr.toString());
    }
}
