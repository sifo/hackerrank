// https://www.hackerrank.com/challenges/bon-appetit/problem

import java.util.Scanner;
import java.lang.Math;

class BonAppetit {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int anna = 0;
        for(int i = 0; i < n; i++) {
            if(i != k)
                anna += sc.nextInt();
            else
                sc.nextInt();
        }
        anna /= 2;
        int b = sc.nextInt();
        if(b == anna)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - anna);
    }
}
