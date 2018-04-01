// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.Scanner;

class Loop2 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            double res = a+b;
            System.out.printf("%.0f ", res);
            for(int j = 1; j < n; j++) {
                res = res + Math.pow(2, j)*b;
                System.out.printf("%.0f ", res);
            }
            System.out.println();
        }
        sc.close();
    }
}
