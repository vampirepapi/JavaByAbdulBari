package exceptionsdemo;

public class FinallyDemo {
    public static void main(String[] args) {
        // this program will demonstrate the use of finally block
        // finally block is used to execute important code such as closing a connection, closing a file etc.
        // finally block is always executed whether an exception is handled or not
        try{
            System.out.println(10/0);
        }
        finally{
            System.out.println("this is finally block");
        }

    }
}
