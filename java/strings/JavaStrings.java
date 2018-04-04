import java.io.*;
import java.util.*;

public class JavaStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        System.out.println(A.length() + B.length());
        String lex = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(lex);
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
