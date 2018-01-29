// https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.Scanner;

class MigratoryBirds {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] types = new int[5];
        int max = 0;
        for(int i = 0; i < n; i++) {
            int v = sc.nextInt()-1;
            types[v]++;
            if(types[v] > types[max] || (types[v] == types[max] && v < max)) {
                max = v;
            }
        }
        System.out.println(max+1);
    }
}
