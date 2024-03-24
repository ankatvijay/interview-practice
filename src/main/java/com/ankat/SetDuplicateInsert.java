package com.ankat;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


enum Test{;
    private String m1;
    public Integer i1;
    protected boolean b1;
}
class Student {
    private String name;
    private int age;

    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class SetDuplicateInsert {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Vijay",33));
        students.add(new Student("Vijay",33));
        students.add(new Student("Ajay",30));
        students.add(new Student("Vijay",33));
        System.out.println(students.size());
    }
}
