// https://www.hackerrank.com/challenges/time-conversion/problem

import java.util.*;
import java.util.regex.*;

class TimeConversion {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        sc.findInLine("(\\d+):(\\d+):(\\d+)(\\w+)");
        MatchResult r = sc.match();
        int h = Integer.parseInt(r.group(1));
        int m = Integer.parseInt(r.group(2));
        int s = Integer.parseInt(r.group(3));
        String meridien = r.group(4);

        if(meridien.equals("AM") && h == 12)
            h -= 12;
        if(meridien.equals("PM") && h != 12)
            h += 12;
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}
