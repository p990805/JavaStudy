package collection.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListEx3 {
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
        int total = 0;
        double avg = 0;
        for(Integer number : arr) {
            total += number;
        }
        sb.append("입력한 정수의 합계: ").append(total).append("\n");
        avg = (double) total / arr.size();
        sb.append("입력한 정수의 평균: ").append(avg);
        System.out.println(sb.toString());
    }
}
