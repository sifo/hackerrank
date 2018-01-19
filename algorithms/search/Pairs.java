/*
  https://www.hackerrank.com/challenges/pairs/problem
*/

import java.util.Scanner;
import java.util.Arrays;

class Pairs {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] t = new int[n];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        Arrays.sort(t);

        int res = 0;
        for(int i = 0; i < t.length-1; i++) {
            for(int j = i+1; j < t.length; j++) {
                int tmp = t[j] - t[i];
                if(tmp > k) {
                    break;
                }
                if(tmp == k) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
