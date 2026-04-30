package MethodReferenceAndConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
    public static void main(String[] args) {
        MethodReference mref = new MethodReference();
        List<String> students = Arrays.asList("Mohit","Sonu","Rohit");
//        students.forEach(MethodReference::print);
        students.forEach(mref::print);
    }
    public void print(String s){
        System.out.println(s);
    }
}
