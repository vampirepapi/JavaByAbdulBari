package oops.abstractclasses;

// Shape is an abstract class. This means that it cannot be instantiated directly.
// Instead, other classes must inherit from it and provide implementations for its abstract methods.
public abstract class Shape {
    // This is an abstract method 'perimeter'. 
    // It has no body and ends with a semicolon. 
    // Any class that extends Shape must provide an implementation for this method.
    abstract public double perimeter();

    // This is an abstract method 'area'. 
    // It has no body and ends with a semicolon. 
    // Any class that extends Shape must provide an implementation for this method.
    abstract public double area();
}