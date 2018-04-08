import java.util.Scanner;
import java.util.HashMap;

class Anagrams {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(isAnagram(a, b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        HashMap<Character, Integer> ah = new HashMap<>();
        HashMap<Character, Integer> bh = new HashMap<>();
        for(int i = 0; i < a.length(); i++) {
            int s;
            try {
                s = ah.get(a.charAt(i));
                ah.put(a.charAt(i), ++s);
            } catch(Exception e) {
                ah.put(a.charAt(i), 1);
            }
            try {
                s = bh.get(b.charAt(i));
                bh.put(b.charAt(i), ++s);
            } catch(Exception e) {
                bh.put(b.charAt(i), 1);
            }
        }
        return ah.equals(bh);
    }
}
