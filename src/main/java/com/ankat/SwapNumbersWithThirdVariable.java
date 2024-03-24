package com.ankat;

public class SwapNumbersWithThirdVariable {
    public static void main(String[] args) {
        int a = 12, b = 31;
        System.out.println("A : " + a + " B : " + b);

        a = a + b; // 12 + 31 = 43
        b = a - b; // 43 - 31 = 12;
        a = a - b; // 43 - 12 = 31

        System.out.println("A : " + a + " B : " + b);
    }
}