package exceptionsdemo;

public class ThrowThrowsDemo {
    // this class will demonstrate the use of throw and throws keywords
    // throw keyword is used to explicitly throw an exception
    // throws keyword is used to declare an exception
    // throws is used in the method signature to declare the exceptions that can occur in the method
    // throw is used to throw an exception explicitly
    
    static int area(int l, int b) throws Exception{
        if (l<0 || b<0) {
            throw new Exception();
        }
        return l*b;
    }

    static void meth1() throws Exception{
        System.out.println(area(-10,5));
    }
    public static void main(String[] args) {
        try {
            meth1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
