// https://www.hackerrank.com/challenges/java-list/problem

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class ListManipulation {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        while(length-- > 0) {
            l.add(sc.nextInt());
        }
        int count = sc.nextInt();
        while(count-- > 0) {
            String query = sc.next();
            if(query.equals("Insert")) {
                l.add(sc.nextInt(), sc.nextInt());
            } else if(query.equals("Delete")){
                l.remove(sc.nextInt());
            }
        }
        for(int i: l) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
