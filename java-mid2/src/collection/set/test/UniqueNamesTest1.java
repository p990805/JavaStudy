package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < inputArr.length; i++) {
            set.add(inputArr[i]);
        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
