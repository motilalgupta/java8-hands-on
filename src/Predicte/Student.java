package Predicte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: "+id+", "+"Name: "+name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Motilal");
        Student s2 = new Student(2,"Rahul");
        Predicate<Student> predicate = x -> x.getId() > 1;

        System.out.println(predicate.test(s2));

        List<Student> student = new ArrayList<>(Arrays.asList(s1,s2));
        for(Student data: student){
            if(predicate.test(data)){
                System.out.println(data);
            }
        }
    }
}
