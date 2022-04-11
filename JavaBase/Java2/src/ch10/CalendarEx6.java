package ch10;

import java.util.Calendar;

public class CalendarEx6 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2022, 1, 1);
        System.out.println(date);

        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + date.get(Calendar.MONTH) + date.get(Calendar.DATE) + "";
    }
}
