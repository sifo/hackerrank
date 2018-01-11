/*
  https://www.hackerrank.com/challenges/icecream-parlor/problem
 */

import java.util.Scanner;

class IceCreamParlor {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int [] c = new int[n];
            for(int j = 0; j < c.length; j++) {
                c[j] = sc.nextInt();
            }
            outer:
            for(int k = 0; k < c.length-1; k++) {
                for(int l = k+1; l < c.length; l++) {
                    if(c[k] + c[l] == m) {
                        System.out.println((k+1) + " " + (l+1));
                        break outer;
                    }
                }
            }
        }
    }
}
