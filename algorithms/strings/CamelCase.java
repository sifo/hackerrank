import java.util.Scanner;

class CamelCase {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = 1;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                res++;
        }
        System.out.println(res);
    }
}
