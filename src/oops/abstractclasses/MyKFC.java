package oops.abstractclasses;

// MyKFC is a concrete class that extends the abstract class KFC.
// This means that MyKFC inherits all the abstract methods of KFC and is required to provide implementations for them.
public class MyKFC extends KFC {

    // Override the abstract method 'billing' from KFC class.
    // This method is supposed to define the billing process in MyKFC.
    // Currently, it throws an UnsupportedOperationException because it's not yet implemented.
    @Override
    void billing() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'billing'");
    }

    // Override the abstract method 'offer' from KFC class.
    // This method is supposed to define the offer process in MyKFC.
    // Currently, it throws an UnsupportedOperationException because it's not yet implemented.
    @Override
    void offer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'offer'");
    }

    // The main method is the entry point for the program.
    // Here, we're creating an instance of MyKFC (but referring to it with a KFC reference), and calling the makeItem method on it.
    public static void main(String[] args) {
        KFC kfc = new MyKFC();
        kfc.makeItem();
    }
}