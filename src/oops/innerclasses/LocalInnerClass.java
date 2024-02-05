package oops.innerclasses;

// This is the outer class named LocalInnerClass.
public class LocalInnerClass {
    // This is a variable of the outer class.
    int x = 10;

    // This is a static method of the outer class. Inside this method, a local inner class is defined.
    // Note: A local inner class is a class defined within a block of code, like a method.
    static void display() {
        // This is the local inner class named Inner. It's defined inside the display method of the outer class.
        class Inner {
            // This is a method of the inner class. It prints a message to the console.
            void innerDisplay() {
                System.out.println("Hello from inner class");
            }
        }
        // This line creates an instance of the inner class.
        Inner i = new Inner();
        // This line calls the innerDisplay method on the inner class instance.
        i.innerDisplay();
    }

    // This is the main method, which is the entry point for the program.
    public static void main(String[] args) {
        // This line calls the display method on the LocalInnerClass class.
        LocalInnerClass.display();
    }
}