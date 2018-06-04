// https://www.hackerrank.com/challenges/java-sort/problem

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Student {
    int id;
    String name;
    float cgpa;

    Student(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class JavaSort {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        List<Student> t = new ArrayList<Student>();
        for(int i = 0; i < n; i++) {
            t.add(new Student(sc.nextInt(), sc.next(), sc.nextFloat()));
        }
        t.sort((Student a, Student b) -> {
                if(a.cgpa < b.cgpa) {
                    return 1;
                } else if(a.cgpa > b.cgpa) {
                    return -1;
                } else {
                    int res = a.name.compareTo(b.name);
                    if(res == 0) {
                        return a.id - b.id;
                    }
                    return res;
                }
            });
        for(Student s: t) {
            System.out.println(s.name);
        }
    }
}

