package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int a = str.indexOf(ext);
        String b = str.substring(0,a);
        String c = str.substring(a);
        System.out.println(b);
        System.out.println(c);
    }
}
