package com.lti.objects;

class StaticInitExample {
    static int statementOrder;
    static int firstVariable = clarifyOrder("Assigning First Variable");

    static {
        clarifyOrder("Executing Initializer 1");
    }

    static int secondVariable = clarifyOrder("Assigning Second Variable");

    static {
        clarifyOrder("Executing Initializer 2");
    }

    static int clarifyOrder(String message) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }
}

public class StaticInitializer {
    public static void main(String[] args) {
        System.out.println("Statement made so far: " + StaticInitExample.statementOrder);
    }
}
