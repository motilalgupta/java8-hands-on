package StaticMethodDemo;

public interface A {
    public static void sayHello(){
        System.out.println("Hello");
    }
}
class MyClass implements A{

    public static void sayHello(){
        System.out.println("Hello");        // class MyClass cannot see it. cannot be overridden
    }

    public static void main(String[] args) {
        MyClass driver = new MyClass();
//        driver.sayHello();        Not available
//        MyClass.sayHello();
//        Not available
        A.sayHello();   // available only
    }
}
