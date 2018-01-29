// https://www.hackerrank.com/challenges/2d-array/problem

import java.util.*;

class Array2D {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int [][] t = new int[6][6];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                t[i][j] = sc.nextInt();
            }
        }
        int maxSum = t[0][0] + t[0][1] + t[0][2] + t[1][1] + t[2][0] + t[2][1] + t[2][2];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int sum = t[0+i][0+j] + t[0+i][1+j] + t[0+i][2+j] + t[1+i][1+j] + t[2+i][0+j] + t[2+i][1+j] + t[2+i][2+j];
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
