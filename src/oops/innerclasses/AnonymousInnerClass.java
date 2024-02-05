package oops.innerclasses;

// This is an abstract class named abc. Abstract classes cannot be instantiated, but they can be subclassed.
// They often contain one or more abstract methods, which are methods declared without an implementation.
abstract class abc {
    // This is an abstract method named display. It's declared without an implementation.
    abstract void display();
}

// This is an interface named TestInterface. An interface is a reference type in Java, similar to a class, 
// that can contain only constants, method signatures, default methods, static methods, and nested types.
interface TestInterface{
    // This is an abstract method named display2. It's declared without an implementation.
    void display2();
}

// This is the outer class named AnonymousInnerClass.
public class AnonymousInnerClass {
    // This is a method of the outer class. Inside this method, an anonymous inner class is defined and instantiated.
    public void meth() {
        // This line creates an instance of an anonymous inner class that extends the abstract class abc.
        // The anonymous inner class provides an implementation for the abstract display method.
        abc anonyClass = new abc() {
            @Override
            void display() {
                System.out.println("Hello from anonymous class.");
            }
        };
        // This line calls the display method on the anonymous inner class instance.
        anonyClass.display();
    }

    // This is another method of the outer class. Inside this method, another anonymous inner class is defined and instantiated.
    public void meth2(){
        // This line creates an instance of an anonymous inner class that implements the TestInterface interface.
        // The anonymous inner class provides an implementation for the abstract display2 method.
        TestInterface tf = new TestInterface() {
            @Override
            public void display2() {
                System.out.println("Hi from anonymous class that is implementing TestInterface.");
            }
        };
        // This line calls the display2 method on the anonymous inner class instance.
        tf.display2();
    }

    // This is the main method, which is the entry point for the program.
    public static void main(String[] args) {
        // This line creates an instance of the outer class.
        AnonymousInnerClass oc = new AnonymousInnerClass();
        // These lines call the meth and meth2 methods on the outer class instance.
        oc.meth();
        oc.meth2();
    }
}