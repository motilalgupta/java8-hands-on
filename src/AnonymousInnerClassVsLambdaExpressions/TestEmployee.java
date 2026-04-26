package AnonymousInnerClassVsLambdaExpressions;

import java.security.spec.RSAOtherPrimeInfo;

public class TestEmployee {
    public static void main(String[] args) {
//        Employee employee = new SoftwareEngineer();
//        System.out.println(employee.getSalary());       // without anonymous class
//        System.out.println(employee.getDesignation());

        Employee employee = new Employee() {
            @Override
            public int getSalary() {
                return 1000;
            }
                                                        // with anonymous inner class
            @Override                                   // Don't need to create implementation class
            public String getDesignation() {
                return "Software Engineer";
            }
        };
        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());
    }
}
