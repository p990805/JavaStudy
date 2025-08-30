package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("Integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String string = (String) stringBox.get();
        System.out.println("String = " + string);

        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();
        System.out.println("Result = " + result);
    }
}
