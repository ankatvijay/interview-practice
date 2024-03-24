package com.lti.operator;

public class Oddities {
    public static void main(String[] args) {
        int number = 10;
        int result = 0;

        System.out.println("--- Test 1 ---");
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = --number - number--;
            System.out.println("i: " + i + ", number: " + number + ", result: " + result);
        }

        System.out.println("--- Test 2 ---");
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = number-- - --number;
            System.out.println("i: " + i + ", number: " + number + ", result: " + result);
        }

        System.out.println("--- Test 3 ---");
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = number-- - number++ * --number;
            System.out.println("i: " + i + ", number: " + number + ", result: " + result);
        }

        System.out.println("--- Test 4 ---");
        number = 10;
        boolean isEqual = (number--) == (number += 1);
        System.out.println("isEqual: " + isEqual + ", number: " + number);
    }
}
