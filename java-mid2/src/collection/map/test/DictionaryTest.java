package collection.map.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DictionaryTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> dict = new HashMap<>();

        while(true) {
            System.out.println("==단어 입력 단계==");
            System.out.print("영어 단어를 입력하세요 (종료는 'q): ");
            String a = br.readLine();
            if(a.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String b = br.readLine();
            dict.put(a,b);

        }
        System.out.println("단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q) : ");
            String SearchWord = br.readLine();
            if(SearchWord.equals("q")){
                break;
            }
            if(dict.containsKey(SearchWord)){
                String Answer = dict.get(SearchWord);
                System.out.println(SearchWord + "의 뜻: " + Answer);
            } else {
                System.out.println(SearchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }

    }
}
