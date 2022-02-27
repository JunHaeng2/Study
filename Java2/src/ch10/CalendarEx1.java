package ch10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.DAY_OF_WEEK));
        System.out.println(today.get(Calendar.AM));
    }
}
