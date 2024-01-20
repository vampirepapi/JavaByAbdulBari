package oops.inheritnace.thisandsuper;

class Rectangle{
    int length;
    int breadth;
    int x = 10;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

}

class Cuboid extends Rectangle{
    int height;
    int x = 20;

    Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class ThisVsSuper {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10, 20, 30);
        c.display();
    }
}
