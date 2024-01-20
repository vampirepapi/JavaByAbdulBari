package oops.inheritnace;

// Define a Rectangle class
class Rectangle{
    int length;
    int breadth;

    // Default constructor, sets length and breadth to 1
    Rectangle(){
        length = breadth =1;
    }

    // Parameterized constructor, sets length and breadth to provided values
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
}

// Define a Cuboid class that extends Rectangle
class Cuboid extends Rectangle{
    int height;

    // Default constructor, sets height to 1
    Cuboid(){
        height =1;
    }

    // Parameterized constructor, sets height to provided value
    Cuboid(int h){
        height = h;
    }

    // Parameterized constructor, sets length, breadth, and height to provided values
    Cuboid(int l, int b, int h){
        super(l,b); // Call the superclass' constructor to set length and breadth
        height = h;
    }

    // Method to calculate and return the volume of the cuboid
    int calcVolume(){
        return length*breadth*height;
    }
}

public class ExampleParamConstructor {
    public static void main(String[] args) {
        // Create a Cuboid with default values and print its volume
        Cuboid c1 = new Cuboid(); 
        System.out.println("cuboid volume w/o passing any param -" + c1.calcVolume());

        // Create a Cuboid with only height set and print its volume
        Cuboid c2 = new Cuboid(10);
        System.out.println("cuboid volume w/ passing height only -" + c2.calcVolume());
   
        // Create a Cuboid with all dimensions set and print its volume
        Cuboid c3 = new Cuboid(10,10,10);
        System.out.println("cuboid volume w/ passing all params -" + c3.calcVolume());
    }
}