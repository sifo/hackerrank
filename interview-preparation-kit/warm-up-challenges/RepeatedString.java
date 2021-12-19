import java.util.Scanner;

public class RepeatedString {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        char [] t = sc.next().toCharArray();
        long n = sc.nextLong();
        long res = 0;
        int max = t.length > n ? (int) n : t.length;
        for(int i = 0; i < max; i++) {
            if(t[i] == 'a'){
                res ++;
            }
        }
        if(n > t.length) {
            res *= n/t.length;
            for(int i = 0; i < n%t.length; i++) {
                if(t[i] == 'a'){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
