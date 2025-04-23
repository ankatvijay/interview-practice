package com.ankat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class MyEmployee extends Employee {
    private Set<String> book;

    public MyEmployee(int empId, String empName, String empAddress) {
        super(empId, empName, empAddress);
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }
}

public class FlatMapExample {

    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee(1, "Ajay", "Mumbai");
        e1.addBook("Java 8 in Action");
        e1.addBook("Spring Boot in Action");
        e1.addBook("Effective Java (3nd Edition)");

        MyEmployee e2 = new MyEmployee(2, "Rahul", "Nagpur");
        e2.addBook("Learning Python, 5th Edition");
        e2.addBook("Effective Java (3nd Edition)");

        List<MyEmployee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        Set<String> collect =
                list.stream()
                        .map(x -> x.getBook())                              //  Stream<Set<String>>
                        .flatMap(x -> x.stream())                           //  Stream<String>
                        .filter(x -> !x.toLowerCase().contains("python"))   //  filter python book
                        .collect(Collectors.toSet());                       //  remove duplicated

        collect.forEach(System.out::println);
    }
}
