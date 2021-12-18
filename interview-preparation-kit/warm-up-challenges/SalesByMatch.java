import java.util.Scanner;

public class SalesByMatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] t = new int[100];
        for(int i = 0; i < n; i++) {
            t[sc.nextInt()-1]++;
        }
        int res = 0;
        for(int i = 0; i < t.length; i++) {
            res += t[i]/2;
        }
        System.out.println(res);
    }
}
