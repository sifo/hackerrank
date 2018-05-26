import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] t = new int[sc.nextInt()];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        int res = 0;
        for(int i = 0; i < t.length; i++) {
            int s = 0;
            for(int j = i; j < t.length; j++) {
                s += t[j];
                if(s < 0)
                    res++;
            }
        }

        System.out.println(res);
    }
}
