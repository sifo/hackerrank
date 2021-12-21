import java.util.Scanner;

public class TwoDimensionsArray {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int [][] t = new int[6][6];
        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t[i].length; j++) {
                t[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int sum = t[i][j]   + t[i][j+1]   + t[i][j+2]
                                    + t[i+1][j+1] +
                          t[i+2][j] + t[i+2][j+1] + t[i+2][j+2];
                max = sum > max ? sum : max;
            }
        }
        System.out.println(max);
    }
}
