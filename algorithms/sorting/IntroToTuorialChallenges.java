// https://www.hackerrank.com/challenges/tutorial-intro/problem

import java.util.Scanner;

class IntroToTutorialChallenges {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int n = sc.nextInt();
        int [] t = new int[n];
        for(int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(t[i] == V) {
                System.out.println(i);
            }
        }
    }
}
