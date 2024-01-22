// Define the package this class belongs to
package oops.inheritnace.methodoverriding;

// Define a Parent class
class Parent{
    // Define a method named display
    void display(){
        // Print a message
        System.out.println("Hello");
    }
}

// Define a Child class that extends Parent
class Child extends Parent{
    // Override the display method from the Parent class
    @Override
    void display(){
        // Print a different message
        System.out.println("Hello Welcome");
    }
}

// Define a public class named MethodOverriding
public class MethodOverriding {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of Child
        Child ch = new Child();
        // Call the display method, which is overridden in the Child class
        ch.display();
    }
}