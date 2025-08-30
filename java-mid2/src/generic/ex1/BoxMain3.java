package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();

        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("Integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");
        String str = stringBox.get();
        System.out.println("String = " + str);

        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.2);
        Double d = doubleBox.get();
        System.out.println("Double = " + d);
    }
}
