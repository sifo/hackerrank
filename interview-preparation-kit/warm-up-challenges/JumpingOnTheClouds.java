import java.util.Scanner;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] t = new int[n];
        for(int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int res = 0;
        for(int i = 0; i < t.length-1;) {
            if(i+2 < t.length && t[i+2] == 0)
                i += 2;
            else
                i += 1;
            res++;
        }
        System.out.println(res);
    }
}
