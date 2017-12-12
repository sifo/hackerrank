import java.util.Scanner;
import java.util.Vector;

class Quicksort {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] t = new int [n];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        Vector<Integer> left = new Vector<Integer>();
        Vector<Integer> right = new Vector<Integer>();
        for(int i = 1; i < t.length; i++) {
            if(t[i] < t[0])
                left.add(t[i]);
            else if(t[i] > t[0])
                right.add(t[i]);
        }
        for(int e: left) {
            System.out.print(e + " ");
        }
        System.out.print(t[0] + " ");
        for(int e: right) {
            System.out.print(e + " ");
        }
        System.out.println();

    }
}
