package javaeightfeatures.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListElementWLambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        al.add(2);
        System.out.println("Before Sorting: "+al);
        Collections.sort(al,(i1,i2)->(i1>i2)?-1:(i1<i2?1:0));
        System.out.println("After Sorting: "+al); 
    }
}
