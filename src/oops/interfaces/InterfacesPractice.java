package oops.interfaces;

// Test is an interface that declares two methods: meth1 and meth2.
interface Test {
    public void meth1();
    public void meth2();
}

// MyClass is a concrete class that implements the Test interface.
// This means that MyClass must provide implementations for all methods declared in Test.
class MyClass implements Test {

    // Override the meth1 method from the Test interface.
    @Override
    public void meth1() {
        System.out.println("Hi form MyClass - meth1");
    }

    // Override the meth2 method from the Test interface.
    @Override
    public void meth2() {
        System.out.println("Hi form MyClass - meth1");
    }

    // This is a method specific to MyClass. It is not part of the Test interface.
    //meth3 is concerete method, specific to MyClass.
    public void meth3(){
        System.out.println("Hi im not overriden method, so to call me you can use reference of other class/interface");
    }

}

// This is the main class where the program starts execution.
public class InterfacesPractice {
    public static void main(String[] args) {
        // Create an instance of MyClass, but refer to it with a Test reference.
        Test t1 = new MyClass();
        // Call the meth1 method, which is declared in the Test interface.
        t1.meth1();
        // Call the meth3 method, which is specific to MyClass.
        // This requires casting the Test reference back to a MyClass reference.
        ((MyClass)t1).meth3();
    }

}