package collection.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ListEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int a = Integer.parseInt(br.readLine());
            if(a == 0) {
                break;
            }
            arr.add(a);
        }
        System.out.println("출력");
        for(int i =0; i< arr.size()-1;i++){
            sb.append(arr.get(i)).append(", ");
        }
        sb.append(arr.getLast());

        System.out.println(sb.toString().trim());
    }
}
