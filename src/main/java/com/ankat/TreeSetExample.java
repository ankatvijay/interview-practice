package com.ankat;

import java.util.Set;
import java.util.TreeSet;





public class TreeSetExample {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Ajay","Mumbai");
        Employee e2 = new Employee(2, "Rahul","Nagpur");
        Employee e3 = new Employee(3, "Soheb","Pune");

        Set<Employee> employees = new TreeSet<Employee>();
        employees.add(e3);
        employees.add(e1);
        employees.add(e2);

        //Collections.sort(employees);

        employees.forEach(System.out::println);

    }
}
