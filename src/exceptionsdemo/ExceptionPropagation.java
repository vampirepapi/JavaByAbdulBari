package exceptionsdemo;
public class ExceptionPropagation {
    // this class will demonstrate exception propagation
    // exception propagation is the process of passing an exception from one method to another
    // if an exception occurs in a method, the method creates an exception object and passes it to the runtime system

    static int meth1(){
        int a = 10;
        int b = 0;
        int c = a/b;
        return c;
    }

    static void meth2(){
        meth1();
    }

    static void meth3(){
        meth2();
    }

    public static void main(String[] args) {
        try{
            meth3();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    
}