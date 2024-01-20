// Define the package this class belongs to
package oops.inheritnace.thisandsuper;

// Define a Rectangle class
class Rectangle{
    // Declare two instance variables: length and breadth
    int length;
    int breadth;

    // Define a constructor that takes two parameters
    Rectangle(int length, int breadth){
        // The 'this' keyword refers to the current instance of the class
        // Here, it's used to distinguish between the instance variables and the parameters, which have the same names
        this.length = length; // Assign the value of the length parameter to the length instance variable
        this.breadth = breadth; // Assign the value of the breadth parameter to the breadth instance variable
    }

    // Define a method to display the length and breadth
    void display(){
        // The 'this' keyword is not necessary here because there's no ambiguity, but it's used for clarity
        System.out.println("Length: " + this.length + " Breadth: " + this.breadth);
    }
}

// Define a public class named ThisKeyword
public class ThisKeyword {
    // No code inside this class yet
}