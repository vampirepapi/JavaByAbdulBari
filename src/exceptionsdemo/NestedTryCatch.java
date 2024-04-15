package exceptionsdemo;

public class NestedTryCatch {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,0};
        try{
            int c=A[0]/A[4];
            System.out.println(c);
            try{
                int d = A[11];
                System.out.println(d);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("program execution is done");

        
    }
    
}
