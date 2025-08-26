package exception.ex0;
import java.io.*;
import java.util.*;

public class MainV0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NetworkServiceV0 networkService = new NetworkServiceV0();

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
