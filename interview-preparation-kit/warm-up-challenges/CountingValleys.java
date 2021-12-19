import java.util.Scanner;

public class CountingValleys {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] path = sc.next().toCharArray();
        int c = 0;
        int res = 0;
        for(int i = 0; i < path.length; i++) {
            if(path[i] == 'U') {
                c++;
            } else {
                if(c == 0) res++;
                c--;
            }
        }
        System.out.println(res);
    }
}
