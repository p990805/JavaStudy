package class1;

public class ClassStart1 {
    static class Student {
        String name;
        int age;
        int grade;

        public Student(String name, int age, int grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }
    public static void main(String[] args) {

        Student student1 = new Student("student1", 20, 90);
        Student student2 = new Student("student2", 23, 90);
        Student student3 = new Student("student3", 23, 90);

        Student[] students = {student1, student2, student3};
        for(int i =0; i<students.length; i++) {
            System.out.println("이름: "+students[i].name+ " 나이: "+students[i].age+ " 성적: "+students[i].grade);
        }
    }
}
