// https://www.hackerrank.com/challenges/crush/problem

import java.util.*;

/*
class AlgorithmicCrush {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long [] t = new long[N];
        int max = 0;
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            for(int j = a-1; j < b; j++) {
                t[j] += k;
                if(t[j] > t[max])
                    max = j;
            }
        }
        System.out.println(t[max]);
    }
}
*/

// Correction
class AlgorithmicCrush {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long [] t = new long[N];
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            t[a-1] += k;
            if(b < N)
                t[b] -= k;
        }
        long cur = 0;
        long max = 0;
        for(int i = 0; i < N; i++) {
            cur += t[i];
            if(cur > max)
                max = cur;
        }
        System.out.println(max);
    }
}

