package javaeightfeatures.lambdaexpressions;

import java.util.TreeSet;

// tree set with custom comparator
// treeset is a sorted set that uses a tree for storage and is ordered by the elements' natural ordering or by a comparator provided at set creation time
public class TreeSetWCustomComparator {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>((i1,i2)->(i1>i2?-1:(i1<i2?1:0)));
        ts.add(10);
        ts.add(0);
        ts.add(15);
        ts.add(5);
        ts.add(20);
        ts.add(2);
        System.out.println("After Sorting in Descending order: "+ts);

    }
    
}
