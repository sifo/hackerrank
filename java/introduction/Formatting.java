import java.util.Scanner;

class Formatting {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.next();
        int n1 = sc.nextInt();
        String l2 = sc.next();
        int n2 = sc.nextInt();
        String l3 = sc.next();
        int n3 = sc.nextInt();
        System.out.println("================================");
        System.out.printf("%-14s %03d%n", l1, n1);
        System.out.printf("%-14s %03d%n", l2, n2);
        System.out.printf("%-14s %03d%n", l3, n3);
        System.out.println("================================");
        sc.close();
    }
}
