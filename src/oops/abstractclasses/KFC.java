package oops.abstractclasses;

// KFC is an abstract class. This means that it cannot be instantiated directly.
// Instead, other classes must inherit from it and provide implementations for its abstract methods.
public abstract class KFC {

    // This is the constructor for the KFC class.

    KFC(){
        System.out.println("Hello from KFC");;
    }

    // This is a non-abstract method 'makeItem'. 
    // It can have an implementation in the abstract class, and it can also be overridden in subclasses.
    // Currently, it declares two integer variables item1 and item2, but does not do anything with them.
    void makeItem(){
        int item1 = 0;
        int item2 = 1; 
        System.out.println("item1: " + item1 + ", item2: " + item2);
    }

    // This is an abstract method 'billing'. 
    // It has no body and ends with a semicolon. 
    // Any class that extends KFC must provide an implementation for this method.
    abstract void billing();

    // This is an abstract method 'offer'. 
    // It has no body and ends with a semicolon. 
    // Any class that extends KFC must provide an implementation for this method.
    abstract void offer();    
    
}