import java.util.Scanner;

class HackerRankInAString {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String m = "hackerrank";
        int cur = 0;
        String res = "";
        for(int i = 0; i < q; i++) {
            String s = sc.next();
            for(int j = 0; j < s.length(); j++) {
                if(cur >= m.length())
                    break;
                if(m.charAt(cur) == s.charAt(j)) {
                    cur++;
                }
            }
            if(cur == m.length())
                res += "YES";
            else
                res += "NO";
            if(i < q-1)
                res += "\n";
            cur = 0;
        }
        System.out.println(res);
    }
}
