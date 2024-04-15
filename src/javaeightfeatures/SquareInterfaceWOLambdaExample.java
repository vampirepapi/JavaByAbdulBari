package javaeightfeatures;

interface Square{
    public int calculateSqr(int x);  
}

class Demo3 implements Square{
    @Override
    public int calculateSqr(int x){
        return x*x;
    }
}

public class SquareInterfaceWOLambdaExample {
    public static void main(String[] args) {
        Square s = new Demo3();
        System.out.println("Square of 5: "+s.calculateSqr(5));
        System.out.println("Square of 10: "+s.calculateSqr(10));
    }

    
}