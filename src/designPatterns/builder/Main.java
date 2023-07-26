package designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().age(10).name("aman").build();
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.fatherName);
    }
}
