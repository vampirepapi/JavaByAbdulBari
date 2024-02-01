package oops.interfaces;

// This is an interface named Test. An interface is a completely abstract class that is used to group related methods with empty bodies.
interface Test {
    // This is a constant declaration. In interfaces, fields are automatically
    // public, static, and final.
    final static int X = 10;

    // This is an abstract method declaration. In interfaces, methods are
    // automatically public and abstract.
    public abstract void meth1();

    // This is a static method. Static methods in interfaces should have a body.
    public static void meth3() {
        System.out.println("hello");
    }

    // This is a default method. Default methods are methods with a default
    // implementation. They were introduced in Java 8 to help with backward
    // compatibility when new methods are added to interfaces.
    default void meth5() {
        System.out.println("hi from meth5");
    }

    // from java9 we can have private abstract methods
    /*
     * Now one more important thing from Java nine
     * it is also allowed to write private method, private,
     * but that private method cannot be abstract.
     * In the beginning, I have changed this to private.
     * So it was an error, I have shown you that.
     * See, you cannot make this method as private.
     * So you can write a private method, which is not abstract.
     * Then what is the use of this method?
     * This method will be internally used inside the interface.
     * Who will use it?
     * Obviously default methods will use it.
     * So if you have some common logic in between default methods
     * then you can define private methods and you can
     * call these private methods inside those default methods.
     * Yes, so private methods are only useful
     * inside default methods.
     */
    // This is a private method named meth6. Private methods are only accessible within the same class.
    // They are used to break down complex problems into smaller, more manageable parts, and to prevent code duplication.
    private void meth6(){
        // This line prints a message to the console.
        System.out.println("Hi from meth6");
    }

    /*
     * You can define private methods in a class and call these private methods inside other methods of the class.
     * Note: Private methods are only accessible within the class they are defined.
     */

    // This is a default method named meth7. Default methods are methods with a default implementation in an interface.
    // They were introduced in Java 8 to help with backward compatibility when new methods are added to interfaces.
    // Default methods can be overridden by implementing classes.
    default void meth7(){
        // This line calls the private method meth6.
        meth6();
    }
}

// This is another interface named Test2. It extends Test, which means it
// inherits all the abstract methods of Test.
interface Test2 extends Test {
    // This is an abstract method declaration. It's unique to Test2.
    void meth4();
}

// This is a class named My that implements the Test2 interface. When a class
// implements an interface, it needs to provide implementations for all the
// abstract methods in the interface.
class My implements Test2 {
    // Here, the class is providing an implementation for the meth1 method.
    @Override
    public void meth1() {
        throw new UnsupportedOperationException("Unimplemented method 'meth1'");
    }

    // Here, the class is providing an implementation for the meth4 method.
    @Override
    public void meth4() {
        throw new UnsupportedOperationException("Unimplemented method 'meth4'");
    }

    @Override
    public void meth6() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'meth6'");
    }
}

// This is a class named InterfaceRules that implements the Test interface.
public class InterfaceRules implements Test {
    public static void main(String[] args) {
        // This is printing the constant X from the Test interface.
        System.out.println(Test.X);

        // This is creating an instance of InterfaceRules and calling the meth5 method
        // on it.
        InterfaceRules obj = new InterfaceRules();
        obj.meth5();
    }

    // Here, the class is providing an implementation for the meth1 method.
    @Override
    public void meth1() {
        throw new UnsupportedOperationException("Unimplemented method 'meth1'");
    }
}