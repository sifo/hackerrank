// https://www.hackerrank.com/challenges/phone-book/problem

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class MapPhoneBook {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> p = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++) {
            p.put(sc.nextLine(), new Integer(sc.nextInt()));
            sc.nextLine();
        }
        while(sc.hasNext()) {
            String s = sc.nextLine();
            Integer v = p.get(s);
            if(v != null) {
                System.out.println(s + "=" + v);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
