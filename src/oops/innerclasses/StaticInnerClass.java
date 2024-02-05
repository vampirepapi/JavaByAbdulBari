package oops.innerclasses;

// This is the outer class named StaticInnerClass.
public class StaticInnerClass {
    // These are variables of the outer class. x is static, and y is non-static.
    static int x = 10;
    int y = 10;

    // This is a static inner class named Inner. A static inner class is a static member of the outer class,
    // and it behaves like any other static member. It can be accessed without creating an instance of the outer class.
    static class Inner{
        // This is a method of the inner class. It displays the values of the outer class variables x and y.
        void display(){
            // The inner class can access the static variable of the outer class.
            System.out.println(x);
            // The inner class can't access the non-static variable of the outer class.
            // This line will cause a compile error.
            System.out.println(y);
        }
    }

    // This is the main method, which is the entry point for the program.
    public static void main(String[] args) {
        // To create an instance of the static inner class, we don't need to create an instance of the outer class.
        // We can directly create a new instance of the inner class using the syntax OuterClass.InnerClass().
        StaticInnerClass.Inner innerClass = new StaticInnerClass.Inner();
        // This line calls the display method on the inner class instance.
        innerClass.display();
    }
}
