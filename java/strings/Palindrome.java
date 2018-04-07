import java.util.Scanner;

class Palindrome {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        boolean isPalindrome = true;
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
