package com.lti.objects;

class ASuperClass {
    String name;

    // Constructor for Super Class
    ASuperClass() {
        System.out.println("Parent constructor executes");
    }

    // Initializer code
    {
        this.name = "Override";
        System.out.println("Parent initializer executes");
        System.out.println(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "My name is " + this.name;
    }
}

class ASubClass extends ASuperClass {

    // Constructor for Sub Class
    ASubClass() {
        System.out.println("Child no args constructor executes");
        setName(name);
    }

    // Constructor for Sub Class
    ASubClass(String name) {
        super();
        System.out.println("Child single argument constructor executes");
        setName(name);
    }

    // Initializer code
    {
        this.name = "Override";
        System.out.println("Child initializer executes");
        System.out.println(this);
    }

}

public class InitializerOddsAndEnds {
    public static void main(String[] args) {

        System.out.println("--- Test 1 ---");
        ASubClass joe = new ASubClass("Joe");
        System.out.println(joe);

        System.out.println("--- Test 2 ---");
        ASuperClass tom = new ASubClass("Tom");
        System.out.println(tom);
    }
}