import java.util.*;

class LeftRotation {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int [] t = new int[n];
        for(int i = 0; i < t.length; i++)
            t[i] = sc.nextInt();
        while(d > 0) {
            int first = t[0];
            for(int i = 0; i < t.length-1; i++)
                t[i] = t[i+1];
            t[t.length-1] = first;
            d--;
        }
        for(int i = 0; i < t.length; i++)
            System.out.print(t[i] + " ");
        System.out.println();
    }
}
