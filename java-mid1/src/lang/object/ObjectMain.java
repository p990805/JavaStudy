package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMehtod();

        //toString은 Object 클래스의 메서드
        //눈에 보이지는 않지만 Parent는 Object를 상속
        //Child는 Parent를 상속 허가애 사용 가능
        String string = child.toString();
        System.out.println(string );
    }
}
