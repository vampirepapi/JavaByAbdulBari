package oops.finalkeyword;

// A final class is a class that can't be extended
final class Test1{
    // A method in the final class
    void display(){
        System.out.println("hello");
    }
}

// This will cause a compile time error because we can't inherit from a final class
class Test extends Test1{ 
    // A final method can't be overridden in a subclass
    final void show(){
        System.out.println("Test::show() called");
    }
}

// The main class for the demo
public static class FinalDemo extends Test{
    // A final variable is a constant, we can't change its value once it's initialized
    // Here we're initializing it directly
    final int MAX_VALUE = 99;
    
    // A final variable, we'll initialize it in an instance block
    final float PI;
    // Inside an instance block
    {
        PI = 3.14f;
    }

    // This will cause a compile time error because we can't initialize a final variable in a static block
    static
    {
        // PI = 3.14f; 
    }

    // A final variable, we'll initialize it in the constructor
    final int max ;
    FinalDemo()
    {
        max = 99;
    }

    // The main method for the demo
    public static void main(String[] args) {
        // Create an instance of FinalDemo
        FinalDemo obj = new FinalDemo();
        // Print out the values of the final variables
        System.out.println(obj.MAX_VALUE);
        System.out.println(obj.PI);
        System.out.println(obj.max);
    }

    // This will cause a compile time error because we can't override a final method
    @Override
    void show(){ 
        System.out.println("FinalDemo::show() called");
    }
}