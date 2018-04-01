// https://www.hackerrank.com/challenges/java-loops-i/problem

import java.util.Scanner;

public class Loops1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n*i);
        }
    }
}
