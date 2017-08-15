import java.util.Scanner;

class WeightedUniformStrings {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int [] t = new int[n];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        int [] alphabet = new int[26];

        for(int i = 0; i < alphabet.length; i++) {
            int max = 0;
            int cur = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j)-'a' == i) {
                    cur++;
                    if(cur > max) {
                        max = cur;
                    }
                } else {
                    cur = 0;
                }
            }
            alphabet[i] = max;
        }

        outer:
        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < alphabet.length; j++) {
                for(int k = 0; k < alphabet[j]; k++) {
                    if(t[i] == (j+1)*(k+1)) {
                        System.out.println("Yes");
                        continue outer;
                    }
                }
            }
            System.out.println("No");
        }
    }
}
