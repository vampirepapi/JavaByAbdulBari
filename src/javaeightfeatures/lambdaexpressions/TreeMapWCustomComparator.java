package javaeightfeatures.lambdaexpressions;

import java.util.TreeMap;

// treemap with custom comparator
// treemap is a red-black tree based NavigableMap implementation. It is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
public class TreeMapWCustomComparator {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>((i1,i2)->(i1>i2?-1:(i1<i2?1:0)));
        tm.put(100,"Amit");
        tm.put(102,"Rahul");
        tm.put(101,"Vijay");
        tm.put(103,"Rahul");
        System.out.println("After Sorting in Descending order: "+tm);
        
    }

}
