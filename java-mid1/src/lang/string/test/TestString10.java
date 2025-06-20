package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] arr = fruits.split(",");
        String a = String.join("->",arr);
        System.out.println(a);
    }

}
