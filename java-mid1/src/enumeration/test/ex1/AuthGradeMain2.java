package enumeration.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthGradeMain2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String status = br.readLine();

        AuthGrade authGrade = AuthGrade.valueOf(status.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription()+" 입니다.");
        System.out.println("== 메뉴 목록 ==");

        int lv = authGrade.getLevel();
        if ( lv > 0 ){
            System.out.println("- 메인 화면");
        }
        if ( lv > 1){
            System.out.println("- 이메일 관리 화면");
        }
        if ( lv > 2){
            System.out.println("- 관리자 화면");
        }
    }
}
