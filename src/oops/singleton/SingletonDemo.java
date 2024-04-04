package oops.singleton;

import java.util.Date;

class CoffeeMachine{
    // Properties for coffee machine
    @SuppressWarnings("unused")
    private int coffeeQty;
    @SuppressWarnings("unused")
    private int waterQty;
    @SuppressWarnings("unused")
    private int milkQty;
    @SuppressWarnings("unused")
    private int sugarQty;

    // Static variable of the CoffeeMachine class itself
    // This will hold the single instance of CoffeeMachine
    private static CoffeeMachine cf = null;

    // Private constructor to prevent creating multiple instances
    CoffeeMachine(){
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugarQty = 1;
    }

    // Dummy getCoffee method
    public float getCoffee()
    {
        return 0.15f;
    }

    // getInstance method that has the return type object of the singleton class
    // This method will create a new instance of CoffeeMachine if it doesn't exist, or return the existing one
    public static CoffeeMachine getInstance(){
        if(cf == null){
            cf = new CoffeeMachine();
        }
        return cf;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        // Create instances of the singleton CoffeeMachine class
        // Since CoffeeMachine is a singleton, all these references should point to the same object
        CoffeeMachine t1 = CoffeeMachine.getInstance();
        CoffeeMachine t2 = CoffeeMachine.getInstance();
        CoffeeMachine t3 = CoffeeMachine.getInstance();

        // Print the references to the console
        System.out.println(t1 + "" + t2 + "" +t3) ;

        // Check if all references point to the same object
        if (t1 ==t2 && t1 == t3) {
            System.out.println("true");
        }

        // Create a new Date object and print the current year
        Date n = new Date();
        System.out.println(n.getYear()+1900);
    }
}