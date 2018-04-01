// https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.Scanner;

class EndFile {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext()) {
            System.out.println(i++ + " " + sc.nextLine());
        }
    }
}
