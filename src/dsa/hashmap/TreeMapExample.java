package dsa.hashmap;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeMapExample {

    public static void main(String args[]){
        Student s1 = new Student(1,"S1");
        Student s2 = new Student(2,"S2");

        Set<Student> s = new TreeSet<>();
        s.add(s1);
        s.add(s2);

        System.out.println(s);
    }
}
