package MethodReferenceAndConstructorReference;

import Predicte.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
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

        Supplier<String> supplier = String::new;
        String str = supplier.get();                    // Doesn't take any input but Does return

        Function<String,String> function = String::new;
        System.out.println(function.apply("hello"));        // Takes and return as well
    }
}
