// https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.util.*;

class AppleAndOrange {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] apples = new int[m];
        int [] oranges = new int[n];
        for(int i = 0; i < apples.length; i++) {
            apples[i] = sc.nextInt();
        }
        for(int i = 0; i < oranges.length; i++) {
            oranges[i] = sc.nextInt();
        }
        int appleCount = 0;
        int orangeCount = 0;
        for(int i = 0; i < apples.length; i++) {
            if(apples[i]+a >= s && apples[i]+a <= t) {
                appleCount++;
            }
        }
        for(int i = 0; i < oranges.length; i++) {
            if(oranges[i]+b >= s && oranges[i]+b <= t) {
                orangeCount++;
            }
        }
        System.out.printf("%d\n%d\n", appleCount, orangeCount);
    }
}
