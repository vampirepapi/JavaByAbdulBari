package exceptionsdemo;
class NegativeDimensionException extends Exception{

    @Override
    public String toString() {
        return "dimension of a rectangle cannot be negative";
    }
    
}

public class ThrowThrowsCustomException {
    // this class will demonstrate the use of throw and throws keywords
    // throw keyword is used to explicitly throw an exception
    // throws keyword is used to declare an exception
    // throws is used in the method signature to declare the exceptions that can occur in the method
    // throw is used to throw an exception explicitly\
    static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }

    static void meth2() throws NegativeDimensionException{
        System.out.println("Area is" + area(10, -5));
    }

    public static void main(String[] args) {
        try {
            meth2();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
    
}
