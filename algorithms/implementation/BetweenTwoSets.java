// https://www.hackerrank.com/challenges/between-two-sets/problem

import java.util.*;

class BetweenTwoSets {

    static int bruteSolution(int [] A, int [] B) {
        int res = 0;
        for(int i = 1; i <= 100; i++) {
            boolean flag = true;
            for(int j = 0; j < B.length; j++) {
                if(B[j]%i != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                for(int k = 0; k < A.length; k++) {
                    if(i%A[k] != 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) {
                res++;
            }
        }
        return res;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] A = new int[n];
        int [] B = new int[m];
        for(int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println(solution(A, B));
    }
}
