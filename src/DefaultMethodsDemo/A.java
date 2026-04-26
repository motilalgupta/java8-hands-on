package DefaultMethodsDemo;

public interface A {
    default void sayHello(){
        System.out.println("Hello from A interface");
    }
}
interface B  {
    default void sayHello(){
        System.out.println("Hello from B interface");
    }
}
class Driver implements A,B{
    public static void main(String[] args) {
        Driver d = new Driver();
        d.sayHello();
    }
    @Override
    public void sayHello() {
        B.super.sayHello();
    }
}
