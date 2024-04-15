package javaeightfeatures;

interface Square{
    public int calculateSqr(int x);  
}

public class SquareInterfaceWLambdaExample {
    public static void main(String[] args) {
        Square s = x-> x*x;
        System.out.println("sqr of 5: " + s.calculateSqr(5));
        System.out.println("sqr of 10:" + s.calculateSqr(10));
    }
    
}
