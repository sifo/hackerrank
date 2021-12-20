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

        int [] copy = new int[a.length];
        for(int i = 0; i < a.length; i++) copy[i] = a[i];

        for(int i = a.length-1; i-d >= 0; i--) {
            a[i-d] = copy[i];
        }
        for(int i = 0; i < d; i++) {
            a[a.length+i-d] = copy[i];
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
