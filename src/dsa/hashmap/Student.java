package dsa.hashmap;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private int rollNo;
    private String name;

   public Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Student c)
    {
        return name.compareTo(c.name);
    }
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
