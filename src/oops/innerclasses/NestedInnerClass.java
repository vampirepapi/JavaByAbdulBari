package oops.innerclasses;

// This is the outer class named Outer.
class Outer{
    // This is a variable of the outer class.
    int x = 0;

    // This is an inner class named Inner. An inner class is a class defined within another class.
    class Inner{
        // This is a variable of the inner class.
        int y = 10;

        // This is a method of the inner class. It displays the values of the outer class variable x and the inner class variable y.
        void display(){
            // The inner class can access the variable of the outer class.
            System.out.println(x);
            System.out.println(y);
        }
    } // The inner class ends here.

    // This is a method of the outer class. It displays the value of the outer class variable x and the inner class variable y.
    void outerDisplay(){
        System.out.println(x);
        // The outer class can't directly access the variable of the inner class.
        // We need to create an object of the inner class to access its variable.
        Inner innerclass = new Inner();
        System.out.println(innerclass.y); 
    }
}

// This is the main class that contains the main method.
public class NestedInnerClass {
    public static void main(String[] args) {
        // Create an object of the outer class.
        Outer oc = new Outer();
        // Call the outerDisplay method on the outer class object.
        oc.outerDisplay();
        // To call a method on the inner class, we have to create an object of the inner class.
        // The syntax for creating an object of an inner class is: OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        Outer.Inner i = new Outer().new Inner();
        // Call the display method on the inner class object.
        i.display();

        //if we compile the code, there will be two classes ie Outer.class & Outer$$Inner.class
        //one for outer class and one for nested inner class
    }
}