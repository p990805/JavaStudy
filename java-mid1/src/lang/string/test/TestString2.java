package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm","spring","jpa"};
        int result =0 ;
        for(String s : arr) {
            result += s.length();
            System.out.println(s+":"+s.length());
        }
        System.out.println("sum = "+ result);
    }
}
