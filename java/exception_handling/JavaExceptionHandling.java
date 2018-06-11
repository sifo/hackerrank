import java.util.Scanner;

class JavaExceptionHandling {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        } catch(ArithmeticException e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
