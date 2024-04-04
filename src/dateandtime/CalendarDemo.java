package dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //create obj of gregorian calendar, this class is extending abstract calendar class
        GregorianCalendar gc=new GregorianCalendar();
        //with gc obj check if the passed year is leap year
        System.out.println(gc.isLeapYear(2024));
        //using get method and 
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
