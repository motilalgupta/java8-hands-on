package StaticMethodDemo;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
interface Test{
    public static void main(String[] args) { // we can write main method inside interface after java 8
        System.out.println("Hello");
    }
}
