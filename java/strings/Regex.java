import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String pattern;
    MyRegex() {
        String p = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|2[0-5][0-5])";
        pattern = String.format("%s\\.%s\\.%s\\.%s", p, p, p, p);
    }
}
