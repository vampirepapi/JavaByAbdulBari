package exceptionsdemo;

public class MultipleCatch {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,0};
        try{
            int c=A[0]/A[5];
            System.out.println(c);
            int d = A[11];
            System.out.println(d);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("program execution is done");

        
    }
    
}
