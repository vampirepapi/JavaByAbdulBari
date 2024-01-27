package oops.abstractclasses;

// Rectangle is a concrete class that extends the abstract class Shape.
// This means that Rectangle inherits all the abstract methods of Shape and is required to provide implementations for them.
public class Rectangle extends Shape {
    // These are the properties of the Rectangle class: length and breadth.
    int length;
    int breadth;

    // Override the abstract method 'perimeter' from Shape class.
    // This method calculates the perimeter of the rectangle.
    @Override
    public double perimeter() {
        return 2*(length+breadth);    
    }

    // Override the abstract method 'area' from Shape class.
    // This method calculates the area of the rectangle.
    @Override
    public double area() {
        return length*breadth;
    }

    // The main method is the entry point for the program.
    // Here, we're creating an instance of Rectangle, setting its length and breadth to 10,
    // and then printing the area of the rectangle.
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 10;
        rec.breadth = 10;

        Shape r= rec;
        System.out.println(r.area());
        
    }
    
}