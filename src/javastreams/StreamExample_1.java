package javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample_1 {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("Shubham");
        name.add("Sourabh");
        name.add("Supriya");
        name.add("Sunidhi");
        name.add("Shriniwas");
        name.add("Guddi");

        //stream object will return a stream
        //Stream s = c.stream();
        //Stream is an interface; c:is any collection interface; stream(): is method present in collection interface as default method
        
        //now i want to filter names that have more than 7 characters in their name
        List<String> name_arr = name.stream().filter(i->i.length()>=7).collect(Collectors.toList());
        System.out.println(name_arr);

        //now i want to get all the names in the uppercase 
        List<String> upperName = name.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperName);
        
        //creating an arraylist with integer data
        ArrayList<Integer> nos = new ArrayList<>();
        nos.add(0);nos.add(5);nos.add(50);nos.add(10);nos.add(20);

        //now the requirement is to sort the elements of arraylist using sorted() of stream
        List<Integer> sortedNos = nos.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNos);

        //requirement is to sort the elements in descending order
        List<Integer> descSortNos = nos.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(descSortNos);
        
    }
    
}
