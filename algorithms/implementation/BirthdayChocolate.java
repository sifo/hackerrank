import java.util.Scanner;

class BirthdayChocolate {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] s = new int[n];
        for(int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();

        int r = 0;
        for(int i = 0; i < s.length - (m-1); i++) {
            int sum = 0;
            for(int j = 0; j < m; j++) {
                sum += s[i+j];
            }
            if(sum == d) {
                r++;
            }
        }
        System.out.println(r);
    }
}
