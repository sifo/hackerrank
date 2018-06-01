// https://www.hackerrank.com/challenges/java-1d-array/problem

import java.util.Scanner;

class Steps {

    public static boolean canWin(int leap, int [] game, int cur, boolean [] visited) {
        try {
            if(visited[cur])
                return false;
            visited[cur] = true;
        } catch (ArrayIndexOutOfBoundsException e) {}

        if(cur < 0)
            return false;
        if(cur > game.length-1)
            return true;
        if(game[cur] == 1)
            return false;
        return canWin(leap, game, cur+leap, visited)
            || canWin(leap, game, cur+1, visited)
            || canWin(leap, game, cur-1, visited);
    }

    public static boolean canWin(int leap, int [] game) {
        boolean [] visited = new boolean[game.length];
        return canWin(leap, game, 0, visited);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int leap = sc.nextInt();
            int [] t = new int[a];
            for(int j = 0; j < a; j++) {
                t[j] = sc.nextInt();
            }
            System.out.println((canWin(leap, t)) ? "YES": "NO");
        }
        sc.close();
    }
A}
