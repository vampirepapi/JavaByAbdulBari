// Define the package this class belongs to
package oops.inheritnace.methodoverriding;

// Define a Car class
class Car{
    // Define a method to start the car
    void start(){
        System.out.println("car started");
    }

    // Define a method to accelerate the car
    void accelerate(){
        System.out.println("car is accelerated");
    }

    // Define a method to change the car's gear
    void changeGear(){
        System.out.println("car gear changes");
    }
}

// Define a LuxuryCar class that extends Car
class LuxuryCar extends Car{
    // Override the changeGear method from the Car class
    void changeGear(){
        System.out.println("automatic gear");
    }

    // Define a method to open the car's roof
    void openRoof(){
        System.out.println("sunroof is open");
    }
}

// Define a public class named CarAndLuxuryCar
public class CarAndLuxuryCar {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of LuxuryCar
        LuxuryCar c = new LuxuryCar();
        // Call the start, accelerate, changeGear, and openRoof methods
        c.start();
        c.accelerate();
        c.changeGear();
        c.openRoof();

        // Create an instance of LuxuryCar, but upcast it to Car
        Car c1 = new LuxuryCar();
        // Call the openRoof method, but first downcast c1 to LuxuryCar
        ((LuxuryCar) c1).openRoof();
    }
    
}