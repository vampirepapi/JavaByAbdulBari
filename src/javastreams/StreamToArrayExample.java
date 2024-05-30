package javastreams;

import java.util.ArrayList;

public class StreamToArrayExample {
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0); l.add(10); l.add(10); l.add(25); l.add(20);
        System.out.println(l);
        Integer[] array = l.stream().toArray(Integer[] :: new);
        for(int x : array){
            System.out.println(x);
        }
    }
}
