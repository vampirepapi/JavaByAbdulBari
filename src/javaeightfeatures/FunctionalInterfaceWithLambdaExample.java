package javaeightfeatures;
// Functional Interface with Lambda Expression

@FunctionalInterface
interface intf{
    public void m1();

}

// Main class
public class FunctionalInterfaceWithLambdaExample {
    public static void main(String[] args) {
        intf i = () -> System.out.println("Hello");
        i.m1();
    }

    
}