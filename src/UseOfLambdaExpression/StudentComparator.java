package UseOfLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparator {
    int id;
    String name;
    StudentComparator(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Id: "+id+","+" Name:"+name;
    }
}
class StudentTest{
    public static void main(String[] args) {
        List<StudentComparator> studentComparators = new ArrayList<>();
        studentComparators.add(new StudentComparator(1,"Motilal"));
        studentComparators.add(new StudentComparator(4,"Mohit"));
        studentComparators.add(new StudentComparator(2,"Rahul"));

        Collections.sort(studentComparators,(a,b) -> b.id-a.id);
        // Don't need to create separate implementation class for sorting
        System.out.println(studentComparators);
    }
}
