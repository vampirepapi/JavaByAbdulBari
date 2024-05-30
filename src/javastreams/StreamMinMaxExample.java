package javastreams;

import java.util.ArrayList;

public class StreamMinMaxExample {
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);l.add(10);l.add(20);l.add(15);l.add(25);l.add(5);
        
        //to use strem min method we have to pass comparator to
        int min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);

        //to use max method of stream, some comparator needs to be passed
        int max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
    }
}
