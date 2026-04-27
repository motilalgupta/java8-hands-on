package AnonymousInnerClassVsLambdaExpressions.VariableAnd_this;

import AnonymousInnerClassVsLambdaExpressions.Employee;

import java.security.spec.RSAOtherPrimeInfo;

public class StudentTest {
    static int a = 2;       // Can change inside lambda expression
    String course = "B.Tech"; // Can be accessed inside lambda expression
    public static void main(String[] args) {
        geRes();
    }

    public static void geRes(){
//        int a = 2;        // cannot change inside lambda expression
        Student student = () -> {
//           a = 3;
           String course = "Diploma";       // local variable
//            System.out.println(this.course); // Cannot be accessible
            return "B.Tech";
        };
    }
    Student student1 = new Student() {
        String course = "BCA";              // instance variable
        @Override
        public String getCourse() {
            System.out.println(this.course);    // Can be accessible
            return "IT";
        }
    };
}