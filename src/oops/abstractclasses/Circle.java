package oops.abstractclasses;

// Circle is a concrete class that extends the abstract class Shape.
// This means that Circle inherits all the abstract methods of Shape and is required to provide implementations for them.
public class Circle extends Shape {

    // This is the property of the Circle class: radius.
    int radius;

    // Override the abstract method 'perimeter' from Shape class.
    // This method calculates the perimeter (circumference) of the circle.
    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    // Override the abstract method 'area' from Shape class.
    // This method calculates the area of the circle.
    @Override
    public double area() {
        return Math.PI * radius*radius;
    }

    // The main method is the entry point for the program.
    // Here, we're creating an instance of Circle, setting its radius to 10,
    // and then printing the area of the circle.
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        System.out.println(c1.area());
    }
}