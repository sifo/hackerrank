// https://www.hackerrank.com/challenges/plus-minus/problem

import java.util.*;

class PlusMinus {

    static class Fraction {
        float pos;
        float neg;
        float zero;

        Fraction(float pos, float neg, float zero) {
            this.pos = pos;
            this.neg = neg;
            this.zero = zero;
        }
    }

    static Fraction fraction(int [] t) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i = 0; i < t.length; i++) {
            if(t[i] > 0)pos++;
            else if(t[i] < 0) neg++;
            else zero++;
        }
        Fraction f = new Fraction(pos/(float)t.length, neg/(float)t.length, zero/(float)t.length);
        return f;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] t = new int[n];
        for(int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        Fraction res = fraction(t);
        System.out.printf("%.6f\n", res.pos);
        System.out.printf("%.6f\n", res.neg);
        System.out.printf("%.6f\n", res.zero);
    }
}
