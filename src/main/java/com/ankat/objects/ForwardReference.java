package com.lti.objects;

class Thing {

    // Constructor
    Thing() {
        secondString = "b" + secondString;
    }

    // Initializer
    {
        firstString = "a" + thirdString;
    }

    // Static Initializer
    static {
        thirdString = "c";
    }

    // Two instance variables
    String firstString;
    String secondString;

    // static variable
    static String thirdString;

    public String toString() {
        return firstString + secondString + thirdString;
    }
}

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one);
    }
}