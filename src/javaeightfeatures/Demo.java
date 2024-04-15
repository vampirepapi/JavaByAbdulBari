package javaeightfeatures;

public class Demo {
    public int add(int a, int b){
        return a+b;
        System.out.println(a-b);
    }
    public int sub(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("Addition: " + d.add(10, 20));
        System.out.println("Subtraction: " + d.sub(20, 10));
    }

}
