package javaeightfeatures;

interface Intf{
    public void add(int a, int b);
}


public class AddWLambdaExample {
    // here we dont to have define the data type of a and b as it is already defined in the interface
    // compiler can guess the data type of a and b this is called type inference
    // type inference is a feature of java 8 which allows the compiler to guess the data type of the variable
    public static void main(String[] args) {
        Intf i = (a,b) -> System.out.println("Sum: "+(a+b));
        i.add(10,20);
        i.add(1000,200);

    }
    
}
