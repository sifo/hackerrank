/*
  https://www.hackerrank.com/challenges/minimum-loss/problem
*/

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Long;

class DataPoint {
    public long price;
    public int year;
    public DataPoint(long p, int y) {
        price = p;
        year = y;
    }
}

class MinimumLoss {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DataPoint [] p = new DataPoint[n];
        for(int i = 0; i < p.length; i++) {
            p[i] = new DataPoint(sc.nextLong(), i);
        }
        Arrays.sort(p, (d1, d2) -> Long.compare(d1.price, d2.price));

        long res = 0;
        for(int i = 1; i < p.length; i++) {
            for(int j = i-1; j >= 0; j--) {
                if(p[i].year < p[j].year ) {
                    long tmp = p[i].price - p[j].price;
                    if(tmp < res || res == 0) {
                        res = tmp;
                    }
                    break;
                }
            }
        }

        System.out.println(res);
    }
}
