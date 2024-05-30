package javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//if you want to process the objects from the collections then you should use stream
public class StreamFilterConcept {
    public static void main(String args[]){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);

        //now if you want to filter the even elements from the arraylist l

        //w/o using streams
        ArrayList<Integer> k = new ArrayList<>();
        for(Integer i:l){
            if(i%2==0){
                k.add(i);
            }
        }
        System.out.println(k);

        //w/ using stream
        List<Integer> m = l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(m);

        //doubling every values of l and storing into a new list
        List<Integer> n = l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(n);

        
    }
    

}
