import java.util.Scanner;

class StringTokens {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String [] words = s.split("[^a-zA-Z]+");
        if(words.length == 1 && words[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(words.length);
            for(String w : words) {
                System.out.println(w);
            }
        }
    }
}
