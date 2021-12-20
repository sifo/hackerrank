import java.util.Scanner;

public class LeftRotation {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        d = d < n ? d : d%n;
        while(d > 0) {
            int first = a[0];
            for(int i = 0; i < a.length-1; i++){
                a[i] = a[i+1];
            }
            a[a.length-1] = first;
            d--;
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
