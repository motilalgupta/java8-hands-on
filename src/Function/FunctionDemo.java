package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function1 = x -> x.length();
        System.out.println(function1.apply("rahul"));
        Function<String,String> function2 = x -> x.substring(0,3);
        Function<List<Student>, List<Student>> startsWithVip = li -> {
            List<Student> result = new ArrayList<>();
            for(Student s: li){
                if(function2.apply(s.getName()).equalsIgnoreCase("vip")){
                    result.add(s);
                }
            }
            return result;
        };
        Student s1 = new Student(1,"rahul");
        Student s2 = new Student(2,"vipul");
        Student s3= new Student(3,"Amit");
        Student s4= new Student(4,"vipulav");

        List<Student> filteredStudent = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        System.out.println(startsWithVip.apply(filteredStudent));
    }
    private static class Student{
        int id;
        String name;

        public Student(int id,String name) {
            this.id = id;
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
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
