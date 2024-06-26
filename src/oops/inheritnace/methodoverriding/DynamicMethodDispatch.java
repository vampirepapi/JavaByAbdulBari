// Define the package this class belongs to
package oops.inheritnace.methodoverriding;

// Define a Super class
class Super{
    // Define a method named display
    public void display(){
        // Print a message
        System.out.println("super class display");
    }
    public void namo() {
        System.out.println("namo");
        
    }
    public void sourabh() {
        String s = "hi sourabh";
        System.out.println("hi sourabh");
        
    }
}

// Define a Sub class that extends Super
class Sub extends Super{
    // Override the display method from the Super class
    @Override
    public void display(){
        // Print a different message
        System.out.println("sub class display");
    }
    public void shubham() {
        System.out.println("Shubham");
        
    }
    @Override
    public void namo() {
        System.out.println("rani");
    }
    public void sourabh() {
        System.out.println("hi sourabh2");
        
    }
}

// Define a public class named DynamicMethodDispatch
public class DynamicMethodDispatch {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of Sub, but upcast it to Super
        // This is an example of dynamic method dispatch, where the JVM decides at runtime which method to call
        Super sb = new Sub();
        // Call the display method
        // Because sb is actually an instance of Sub, the overridden method in Sub is called
        sb.display();
        sb.namo();
        sb.sourabh();

    }
}