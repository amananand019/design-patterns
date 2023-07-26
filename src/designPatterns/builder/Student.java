package designPatterns.builder;

import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.subjects = builder.subjects;
    }

    public String toString() {
        return "" + " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }

    public static class StudentBuilder {
        int rollNumber;
        int age;
        String name;
        String fatherName;
        String motherName;
        List<String> subjects;

        public StudentBuilder rollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public StudentBuilder motherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
