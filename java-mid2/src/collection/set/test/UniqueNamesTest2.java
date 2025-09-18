package collection.set.test;

import java.util.LinkedHashSet;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        LinkedHashSet<Integer> set = new LinkedHashSet<>(inputArr.length);
        for(int i =0; i < inputArr.length; i++) {
            set.add(inputArr[i]);
        }

        for(Integer a: set) {
            System.out.println(a);
        }
    }
}
