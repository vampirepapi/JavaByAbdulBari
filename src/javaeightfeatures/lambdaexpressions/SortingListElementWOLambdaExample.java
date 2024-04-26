package javaeightfeatures.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Sorting List Elements without using Lambda Expression
// Implementing Comparator Interface
class MyClass implements Comparator<Integer>{

    @Override
    public int compare(Integer I1, Integer I2) {
        return (I1>I2)?-1:(I1<I2)?1:0;
    }
    
}

public class SortingListElementWOLambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        System.out.println("Before Sorting: "+al);
        Collections.sort(al,new MyClass());
        System.out.println("After Sorting: "+al); 
    }
    
}
