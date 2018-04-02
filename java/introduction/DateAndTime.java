// https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime {
    public static String getDay(String day, String month, String year) {
        try {
            Calendar c = Calendar.getInstance();
            String d = String.format("%s/%s/%s", day, month, year);
            Date f = new SimpleDateFormat("dd/MM/yyyy").parse(d);
            c.setTime(f);
            return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        } catch(Exception e) {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.println(getDay(day, month, year));
    }
}
