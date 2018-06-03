// https://www.hackerrank.com/challenges/java-hashset/problem

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class Pair {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> s = new HashSet<String>();
        for(int i = 0; i < n; i++) {
            String e = sc.nextLine();
            s.add(e);
            System.out.println(s.size());
        }
    }
}
