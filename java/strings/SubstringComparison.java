import java.util.Scanner;

class SubstringComparison {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for(int i = 1; i <= s.length()-k; i++) {
            String cur = s.substring(i, k+i);
            if(cur.compareTo(smallest) < 0)
                smallest = cur;
            if(cur.compareTo(largest) > 0)
                largest = cur;
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
