// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

import java.util.Scanner;

public class StaticInitializerBlock {

    static Scanner sc = new Scanner(System.in);
    static int H = sc.nextInt();
    static int B = sc.nextInt();
    static boolean flag = false;

    static {
        try {
            if(B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            flag = true;
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }

}
