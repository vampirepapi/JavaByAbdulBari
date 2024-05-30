package javastreams;

import java.util.ArrayList;

public class StreamForEachExample {
    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<>();
        l.add("Shubham");
        l.add("Supriya");
        l.add("Sunidhi");

        //forEach() in Stream is used to perform some operations for each elements present in stream
        l.stream().forEach(s->System.out.println(s + " Gupta"));
        
    }
}
