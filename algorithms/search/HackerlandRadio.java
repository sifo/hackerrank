/*
  https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 */

import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;

class HackerlandRadio {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] x = new int[n];
        for(int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int res = 0;
        Vector<Integer> radios = new Vector<>();

        for(int i = 0; i < x.length; i++) {
            // find if current house is cover by a radio
            if(radios.isEmpty() || (x[i] - k) > radios.lastElement()) {
                if(i == x.length-1) {
                    radios.add(x[i]);
                    break;
                }

                // find the furtest place to put radio
                for(int j = i+1; j < x.length; j++) {
                    if(x[j] - x[i] > k || j == x.length-1) {
                        radios.add(x[j-1]);
                        break;
                    }
                }
            }
        }
        System.out.println(radios.size());
    }
}
