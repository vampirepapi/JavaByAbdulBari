package oops.statickey;

// Outer classes can't be static, only inner nested classes can be static
public class StaticPractice {
    // Static variable 'x' is shared among all instances of the class
    static int x = 19;
    // Non-static variable 'y' is unique to each instance of the class
    int y = 20;

    // Non-static methods can access both static and non-static members of the class
    void show(){
        // Prints the current values of 'x' and 'y'
        System.out.println(x +" "+ y);
    }

    /**
     * Static methods can't access non-static members of the class
     */
    static void show2(){
        // This line is commented out because it would cause a compile error
        // Static methods can't access non-static variables like 'y'
        // System.out.println(x +" "+ y);
    }

    public static void main(String[] args) {
        // Create a new instance of StaticPractice
        StaticPractice p1 = new StaticPractice();
        // Call the 'show' method, which prints the current values of 'x' and 'y'
        p1.show();
        // Change the value of the static variable 'x'
        // This will affect all instances of StaticPractice
        p1.x = 30;
        // Change the value of the non-static variable 'y'
        // This will only affect 'p1'
        p1.y = 40;
        // Call the 'show' method again, which prints the updated values of 'x' and 'y'
        p1.show();

        // Create another instance of StaticPractice
        StaticPractice p2 = new StaticPractice();
        // Call the 'show' method on 'p2'
        // This will print the updated value of 'x' and the initial value of 'y'
        // because 'x' is shared among all instances, but 'y' is unique to each instance
        p2.show();
    }
}