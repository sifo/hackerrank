// https://www.hackerrank.com/challenges/swap-case/problem

import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

class SwapCase {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = input.chars()
            .mapToObj(e -> Character.isUpperCase((char)e) ? Character.toLowerCase((char) e) : Character.toUpperCase((char) e))
            .map(String::valueOf)
            .collect(Collectors.joining(""));
        System.out.println(result);
    }
}
