import java.util.Scanner;

class CaesarCipher {

    public static char rotate(int c, int n) {
        int res = c;
        if(c >= 'a' && c <= 'z') {
            res = c + n;
            if(c+n > 'z') {
                res = 'a' + (c+n-1) - 'z';
            }
        } else if(c >= 'A' && c <= 'Z'){
            res = c + n;
            if(c+n > 'Z') {
                res = 'A' + (c+n-1) - 'Z';
            }
        }
        return (char)res;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char [] S = sc.next().substring(0, N).toCharArray();
        int K = sc.nextInt();
        for(int i = 0; i < S.length; i++) {
            S[i] = rotate(S[i], K%26);
        }
        System.out.println(String.valueOf(S));
    }
}
