// https://www.hackerrank.com/challenges/java-dequeue/problem
//
// For ArrayDeque usage: see solution in link

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class JavaDequeue {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] t = new int[n];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        int res = 0;
        Map<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(int i = 0; i < m; i++) {
            if(h.containsKey(t[i]))
                h.put(t[i], h.get(t[i])+1);
            else
                h.put(t[i], 1);
        }
        res = h.size();
        for(int i = m; i < t.length; i++) {
            if(h.containsKey(t[i]))
                h.put(t[i], h.get(t[i])+1);
            else
                h.put(t[i], 1);

            if(h.containsKey(t[i-m])) {
                if(h.get(t[i-m]) > 1)
                    h.put(t[i-m], h.get(t[i-m])-1);
                else
                    h.remove(t[i-m]);
            }

            if(h.size() > res) {
                res = h.size();
            }
        }
        System.out.println(res);
    }
}
