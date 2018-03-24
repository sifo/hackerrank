import java.util.Scanner;

class StdinStdout {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextInt());
        System.out.println(scan.nextInt());
        System.out.println(scan.nextInt());
        scan.close();
    }
}
