// https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.*;

class MiniMaxSum {

    static class MinMax {
        long min; long max;
        MinMax(long min, long max) { this.min = min; this.max = max; }
    }

    static MinMax minMax(long [] t) {
        long min = t[0]; long max = t[0]; long sum = 0;
        for(int i = 0; i < t.length; i++) {
            sum += t[i];
            if(min > t[i]) min = t[i];
            if(max < t[i]) max = t[i];
        }
        return new MinMax(sum-max, sum-min);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long [] t = new long[5];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextLong();
        }
        MinMax res = minMax(t);
        System.out.println(res.min + " " + res.max);
    }
}
