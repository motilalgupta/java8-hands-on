package UseOfLambdaExpression;

public class TestEmployee {
    public static void main(String[] args) {
//        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
//        System.out.println(softwareEngineer.getName());

        Employee employee = () -> "Software Engineer";  // we don't need to create separate Software Engineer Class
        System.out.println(employee.getName());
        Employee editor = () -> "Editor";
        System.out.println(editor.getName());
    }
}
