/*
  https://www.hackerrank.com/challenges/maximum-subarray-sum/problem
*/

import java.util.Scanner;
import java.util.TreeSet;
import java.lang.Math;

class MaximumSubarraySum {

    /*
      Slow
     */
    static long f(long [] t, long m) {
        int n = t.length;
        // for memoization
        long [][] sums = new long[n][n];

        for(int i = 0; i < n; i++) {
            sums[i][i] = t[i];
        }

        for(int i = 2; i <= n; i++) {
            for(int j = i-1; j < n; j++) {
                sums[j-(i-1)][j] = sums[j-(i-1)][j-1]+t[j];
            }
        }
        long res = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                long tmp = sums[i][j]%m;
                if(sums[i][j]%m > res)
                    res = tmp;
            }
        }
        return res;
    }

    /*
      Slow
    */
    static long f1(long [] t, long m) {
        int n = t.length;
        // for memoization
        long [][] sums = new long[n][n];

        for(int i = 0; i < n; i++) {
            sums[i][i] = t[i];
        }

        for(int i = 1; i < n; i++) {
            for(int j = 2; j <= i+1; j++) {
                sums[i-(j-1)][i] = sums[i-(j-1)][i-1]+t[i];
            }
        }

        long res = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                long tmp = sums[i][j]%m;
                if(sums[i][j]%m > res)
                    res = tmp;
            }
        }
        return res;
    }

    /*
      Faster
    */
    static long f2(long [] t, long m) {
        int n = t.length;
        // for memoization
        long [] sums = new long[n];

        long res = 0;
        for(int i = 0; i < n; i++) {
            sums[i] = t[i];
            long tmp = sums[i]%m;
            if(tmp > res)
                res = tmp;
        }

        for(int i = 2; i <= n; i++) {
            for(int j = i-1; j < n; j++) {
                sums[j-(i-1)] += t[j];
                long tmp = sums[j-(i-1)]%m;
                if(tmp > res)
                    res = tmp;
            }
        }
        return res;
    }

    /*
      Faster
    */
    static long f3(long [] t, long m) {
        int n = t.length;
        long [] prefix = new long[n];
        long curr = 0;
        for(int i = 0; i < n; i ++) {
            curr += t[i];
            prefix[i] = curr%m;
        }

        long res = 0;
        for(int i = 0; i < n; i ++) {
            for(int j = i-1; j >= 0; j --) {
                res = Math.max(res, (prefix[i] - prefix[j] + m) % m);
            }
            res = Math.max(res, prefix[i]);
        }
        return res;
    }

    /*
      Way Faster
    */
    static long f4(long [] t, long m) {
        int n = t.length;
        long [] prefix = new long[n];
        long curr = 0;
        for(int i = 0; i < n; i ++) {
            curr += t[i];
            prefix[i] = curr%m;
        }

        long res = 0;
        TreeSet<Long> values = new TreeSet<Long>();
        for(int i = 0; i < n; i ++) {
            Long higher = values.higher(prefix[i]);
            if(higher != null) {
                res = Math.max(res, (prefix[i] - higher + m) % m);
            }
            res = Math.max(res, prefix[i]);
            values.add(prefix[i]);
        }
        return res;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int z = 0; z < q; z++) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long [] t = new long[n];
            for(int i = 0; i < n; i++) {
                t[i] = sc.nextLong();
            }
            System.out.println(f4(t, m));
        }
    }
}
