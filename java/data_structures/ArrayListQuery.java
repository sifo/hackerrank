// https://www.hackerrank.com/challenges/java-arraylist/problem

import java.util.Scanner;
import java.util.ArrayList;

class ArrayListQuery {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> t = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> l = new ArrayList<Integer>();
            for(int j = 0; j < m; j++) {
                l.add(sc.nextInt());
            }
            t.add(l);
        }

        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            try {
                System.out.println(t.get(sc.nextInt()-1).get(sc.nextInt()-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
