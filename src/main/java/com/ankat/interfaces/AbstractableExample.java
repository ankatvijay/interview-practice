package com.ankat.interfaces;

// Interface with single abstract method
// remember all non-concrete methods are public and abstract
// implicitly on an interface.
interface Abstractable {
    void makeConcrete();
}

// An abstract class does NOT have to define concrete methods
// for the abstract methods the interface it implements
abstract class AbstractClass implements Abstractable {

    // Create an additional abstract method -
    // Note that this method is NOT public, but package-private
    // and you must declare it abstract.
    abstract void callConcrete();
}

// AbstractableExample extends AbstractClass (which in turn
// implements Abstractable).   The AbstractableExample is required
// to implement all abstract methods defined by the interface and
// not implemented by the abstract class as well as any abstract
// methods declared on the abstract class itself.
public class AbstractableExample extends AbstractClass {
    public static void main(String[] args) {
        AbstractableExample e = new AbstractableExample();
        e.callConcrete();
    }

    // Method is required through extension of AbstractClass -
    // defined on the interface AbstractClass implements.
    public void makeConcrete() {
        System.out.println("method declared on Abstractable interface");
    }

    // Method required through extension of AbstractClass
    void callConcrete() {
        System.out.println("method declared on AbstractClass class");
        makeConcrete();
    }
}
