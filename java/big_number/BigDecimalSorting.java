// https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.util.Scanner;
import java.util.Arrays;
import java.math.BigDecimal;

class BigDecimalSorting {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String [] t = new String[sc.nextInt()];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.next();
        }
        Arrays.sort(t, (String x, String y) -> (new BigDecimal(y)).compareTo(new BigDecimal(x)));
        for(String s: t) {
            System.out.println(s);
        }
    }
}
