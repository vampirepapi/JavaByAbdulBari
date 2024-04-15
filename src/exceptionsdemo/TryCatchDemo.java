package exceptionsdemo;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 nos");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            // printing object of the exception itself, we can print custom exception too
            System.out.println(e);
            System.out.println("div by zero, please enter valid nos");
        }
        System.out.println("program execution completed");
    }
    
}
