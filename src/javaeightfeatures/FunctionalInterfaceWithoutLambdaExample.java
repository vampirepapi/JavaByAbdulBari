package javaeightfeatures;
// Functional Interface without Lambda Expression
@FunctionalInterface

interface intf{
    public void m1();
}

// Class implementing the interface
class Demo1 implements intf{
    @Override
    public void m1(){
        System.out.println("Hello");
    }
}

// Main class
public class FunctionalInterfaceWithoutLambdaExample {
    public static void main(String[] args) {
        intf i = new Demo1();
        i.m1();
    }
    
}
