package exception.ex4;

import exception.ex2.NetworkClientExceptionV2;
import exception.ex3.NetworkServiceV3_2;
import exception.ex4.exception.SendExceptionV4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainV4 {
    public static void main(String[] args) throws IOException, NetworkClientExceptionV2 {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV4 networkService = new NetworkServiceV4();

        while (true) {
            System.out.println("전송할 문자: ");
            String input = br.readLine();
            if(input.equals("exit")) {
                break;
            }
            try{
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        //공통처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out); //스택 트레이스 출력
        if(e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
