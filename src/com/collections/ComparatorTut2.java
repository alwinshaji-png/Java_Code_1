package com.collections;

import java.util.ArrayList;
import java.util.List;

class Student{

    public double getGpa() {
        return gpa;
    }

    private String name;
    private double gpa;

    public Student(String name,double gpa){
        this.name=name;
        this.gpa=gpa;
    }

    public String getName() {
        return name;
    }
}

public class ComparatorTut2 {
    static void main() {

        List<Student> students=new ArrayList<>();
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Akshit", 3.9));

        // Sort by GPA descending
        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa()>0){
                return 1;
            } else if(o2.getGpa() - o1.getGpa()<0){
                return -1;
            }else{
                return 0;
            }
        });

        for (Student s : students) {
            System.out.println(s.getName() + " : " + s.getGpa());
        }


    }
}
