package oops.singleton;

class CoffeeMachine{
    //some properties
    private int coffeeQty;
    private int waterQty;
    private int milkQty;
    private int sugarQty;

    //static var of the class itself
    private static CoffeeMachine cf = null;

    //private constructor
    CoffeeMachine(){
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugarQty = 1;
    }

    //dummy getCoffee method
    public float getCoffee()
    {
        return 0.15f;
    }

    //getInstace method that has the return type object of the singleton class

    public static CoffeeMachine getInstance(){
        if(cf == null){
            cf = new CoffeeMachine();
        }
        return cf;
    }


}

public class SingletonDemo {
    public static void main(String[] args) {
        //create instance of the singleton coffeemachine class and check if they all point at the same obj
        CoffeeMachine t1 = CoffeeMachine.getInstance();
        CoffeeMachine t2 = CoffeeMachine.getInstance();
        CoffeeMachine t3 = CoffeeMachine.getInstance();

        System.out.println(t1 + "" + t2 + "" +t3) ;
        if (t1 ==t2 && t1 == t3) {
            System.out.println("true");;
            
        }
    }

    
}
