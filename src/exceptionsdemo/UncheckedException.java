package exceptionsdemo;

// unchecked exception happens at runtime
// example: ArithmeticException, ArrayIndexOutOfBoundsException
public class UncheckedException {
    public static void main(String[] args) {
        //here we are dividing by zero, so it will throw an ArithmeticException
        //this is an unchecked exception
        //this will not throw any error at compile time
        //this will throw an error at runtime

        try{
            int c = 10/0;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}
