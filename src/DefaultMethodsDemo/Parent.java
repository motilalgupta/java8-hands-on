package DefaultMethodsDemo;

public interface Parent {
    default void sayHello(){
        System.out.println("Hello!");
    }
}
class Child implements Parent{
    @Override
    public void sayHello() {
        System.out.println("Hello from child class");
    }
}
class MyClass{
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
    }
}