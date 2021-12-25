import java.util.Scanner;

public class NewYearChaos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        outer:
        while(t-- > 0) {

            int n = sc.nextInt();
            int [] q = new int[n];
            for(int i = 0; i < q.length; i++) {
                q[i] = sc.nextInt();
            }

            int [] c = new int[n];
            for(int i = 0; i < c.length; i++) {
                c[i] = i+1;
            }

            int [] allBribes = new int[n];

            int bribes = 0;
            for(int i = 0; i < q.length; i++) {
                int bribe = q[i]-(i+1);
                allBribes[q[i]-1] += bribe > 0 ? bribe : 0;
                if(bribe > 2) {
                    System.out.println("Too chaotic");
                    continue outer;
                } else if(bribe > 0) {
                    bribes += bribe;
                }
                int j = 0;
                while(j < bribe) {
                    int tmp = c[q[i]-j-2];
                    c[q[i]-j-2] = c[q[i]-j-1];
                    c[q[i]-j-1] = tmp;
                    j++;
                }

                if(bribe == 2) {
                    if(q[i+1] == c[i+2]) {
                        bribes++;
                        allBribes[q[i+1]-1]++;
                        if(allBribes[q[i+1]-1] > 2) {
                            System.out.println("Too chaotic");
                            continue outer;
                        }
                        int tmp = c[i+1];
                        c[i+1] = c[i+2];
                        c[i+2] = tmp;
                    }
                }
            }

            System.out.println(bribes);
        }
    }
}
