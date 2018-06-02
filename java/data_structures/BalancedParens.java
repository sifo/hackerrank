// https://www.hackerrank.com/challenges/java-stack/problem

import java.util.Scanner;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class BalancedParens {

    public static void main(String [] args) {
        Map<Character, Character> opposite = new HashMap<Character, Character>();
        opposite.put(new Character(')'), new Character('('));
        opposite.put(new Character('}'), new Character('{'));
        opposite.put(new Character(']'), new Character('['));

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String l = sc.next();
            Stack<Character> stack = new Stack<Character>();
            for(int i = 0; i < l.length(); i++) {
                if(!stack.empty() && stack.peek().equals(opposite.get(new Character(l.charAt(i)))))
                {
                    stack.pop();
                } else {
                    stack.push(l.charAt(i));
                }
            }
            System.out.println(stack.empty() ? "true" : "false");
        }
    }
}
