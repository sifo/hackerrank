import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime {

    void checkPrime(int... n) {
        for(int e: n) {
            boolean isPrime = true;
            for(int i = 2; i < e; i++) {
                if(e%i == 0) {
                    isPrime = false;
                }
            }
            if(isPrime && e > 1)
                System.out.print(e + " ");
        }
        System.out.println();
    }
}

public class PrimeChecker {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
                {
                    if(set.contains(methods[i].getName()))
                        {
                            overload=true;
                            break;
                        }
                    set.add(methods[i].getName());

                }
            if(overload)
                {
                    throw new Exception("Overloading not allowed");
                }
        }
        catch(Exception e)
            {
                System.out.println(e);
            }
    }

}
