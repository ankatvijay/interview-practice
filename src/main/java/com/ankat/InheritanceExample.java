package com.ankat;

class A {
    public void call() { // due to final keyword there will be compile time error
        System.out.println("A :: call");
    }
}

class B extends A {
    public void call() {
        System.out.println("B :: call");
    }
}

public class InheritanceExample {
}
