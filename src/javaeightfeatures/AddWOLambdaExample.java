package javaeightfeatures;

interface Intf{
    public void add(int a, int b);
}

class Demo2 implements Intf{
    @Override
    public void add(int a, int b){
        System.out.println("Sum: "+(a+b));
    }
}
public class AddWOLambdaExample {
    public static void main(String[] args) {
        Demo2 i = new Demo2();

        i.add(10,20);
        i.add(100,200);
    }
    
    
}
