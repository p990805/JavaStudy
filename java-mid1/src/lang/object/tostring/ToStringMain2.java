package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1",2);
        Dog dog2 = new Dog("멍멍이2",5);

        System.out.println("1. 단순 toString 홒출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. print 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);


        // toString을 Override로 정의를 하면 참조값을 print로는 못보는데 그 때 볼수있는 방법
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(refValue);

//        1. 단순 toString 홒출
//        lang.object.tostring.Car@4e50df2e
//                dogName=멍멍이1, dogAge=2
//        dogName=멍멍이2, dogAge=5
//        2. print 내부에서 toString 호출
//        lang.object.tostring.Car@4e50df2e
//                dogName=멍멍이1, dogAge=2
//        dogName=멍멍이2, dogAge=5

    }
}
