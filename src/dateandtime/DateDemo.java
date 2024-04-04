package dateandtime;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //will show time in ms passed since 1jan1970
        System.out.println(System.currentTimeMillis());
        //suppose if we pass ms passed since today
        Date d1 = new Date(System.currentTimeMillis());
        System.out.println(d1);
        //we can pass some other dates to create obj of that date
        Date d2=new Date("05/20/2001");
        System.out.println(d2);
        //we can pass params to the obj too
        Date d = new Date();
        System.out.println(d.getMonth());
        System.out.println(d.getYear()+1900);
        int a = 5;
        Integer b = 7;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        String myString = new String("Hello");
        System.out.println(myString);
        String myStrings = "Hello";
        System.out.println(myString.equals(myStrings));
        //india time print
        System.out.println(d);
        //gmt time print
        System.out.println(d.toGMTString());

        
    }

}
