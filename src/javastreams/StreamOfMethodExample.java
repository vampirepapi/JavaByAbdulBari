package javastreams;

import java.util.stream.Stream;

public class StreamOfMethodExample {
    //stream concept can be applied to any group of values or even for arrays also
    public static void main(String[] args) {
        //for group of values - 
        Stream<Integer> s = Stream.of(9,99,999,9999);
        s.forEach(System.out :: println);
        //for arrays -
        Double[] d = {10.1,10.2,10.3}; 
        Stream<Double> ds = Stream.of(d);
        ds.forEach(System.out :: println);

    }
}
