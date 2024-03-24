package com.lti.decisions;

public class IfElseStatement {
    public static void main(String[] args) {
        boolean a = false, b = false, c = false;

        if ((a = true) || (b = true) && (c = true)) ;
        System.out.println("a: " + a + ", b: " + b + ",c: " + c);

        a=false; b=false; c=false;

        if ((a = true) && (b = true) || (c = true)) ;
        System.out.println("a: " + a + ", b: " + b + ",c: " + c);

    }
}
