package oops.inheritnace.polymorphism;
/*
 * This code demonstrates method overloading in Java, where two methods have the same name but different parameters. 
 * The max method is overloaded to find the maximum of either two or three integers.
 */
public class MethodOverloading {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }


    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.max(10, 20));
        System.out.println(obj.max(10, 20, 30));
    }
    

    
}
