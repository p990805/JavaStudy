package exception.ex2;

import exception.ex1.NetworkServiceV1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainV2 {
    public static void main(String[] args) throws IOException,NetworkClientExceptionV2 {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        while (true) {
            System.out.println("전송할 문자: ");
            String input = br.readLine();
            if(input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
