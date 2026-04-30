package MethodReferenceAndConstructorReference;

import Predicte.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReference {
    String name;

    public ConstructorReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConstructorReference{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohit","Karan","Sunidhi");
//        List<ConstructorReference> students = names.stream().map(x -> new ConstructorReference(x))
//                .collect(Collectors.toList());
        List<ConstructorReference> students = names.stream().map(ConstructorReference::new)
                .collect(Collectors.toList());
        System.out.println(students);
    }
}
