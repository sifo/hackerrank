// https://www.hackerrank.com/challenges/funny-string/problem

import java.util.Scanner;

class FunnyString {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [] t = new String[N];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.next();
        }
        outer:
        for(int i = 0; i < t.length; i++) {
            String s = t[i];
            String r = new StringBuilder(t[i]).reverse().toString();
            for(int j = 1; j <= s.length()-1; j++) {
                if(Math.abs(s.charAt(j)-s.charAt(j-1)) != Math.abs(r.charAt(j)-r.charAt(j-1))) {
                    System.out.println("Not Funny");
                    continue outer;
                }
            }
            System.out.println("Funny");
        }
    }
}
