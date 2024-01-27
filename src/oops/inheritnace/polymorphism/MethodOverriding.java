package oops.inheritnace.polymorphism;

class SuperClass {
    public void method() {
        System.out.println("SuperClass");
    }
}

class subClass extends SuperClass {
    @Override
    public void method() {
        System.out.println("subClass");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SuperClass obj = new SuperClass();
        obj.method();
        SuperClass obj1 = new subClass();
        obj1.method();
    }
    
}
