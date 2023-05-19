package learnings.comparing;

import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + ", Age : " + this.age + "\n";
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class UsingComparable {
    public static void main(String[] args) {
        List<Student> newClass = new ArrayList<>();
        newClass.add(new Student("Rohant", 100));
        newClass.add(new Student("Gold", 150));
        newClass.add(new Student("Silver", 80));
        newClass.add(new Student("Diamount", 50));

        Collections.sort(newClass);

        System.out.println(newClass);
    }
}
