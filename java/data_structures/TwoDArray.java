import java.util.Scanner;

public class TwoDArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] t = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                t[i][j] = arrItem;
            }
        }

        int max = t[0][0] + t[0][1] + t[0][2] + t[1][1] + t[2][0] + t[2][1] + t[2][2];
        for (int i = 0; i < 6-2; i++) {
            int s = 0;
            for (int j = 0; j < 6-2; j++) {
                s = t[i][j]   + t[i][j+1]   + t[i][j+2]
                              + t[i+1][j+1]
                  + t[i+2][j] + t[i+2][j+1] + t[i+2][j+2];
                if (s > max) max = s;
            }
        }
        System.out.println(max);

        scanner.close();
    }
}
