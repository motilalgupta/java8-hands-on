package InheritanceInFunctionalInterface;
@FunctionalInterface
public interface Child extends Parent{
//    void sayHi();     // not a functional interface because more than one abstract method
    void sayHello(); // yes it is a functional interface because method name is same as Parent class

    public default void add(int a, int b) {    // yes because default method

    }
    public static void greet() {       // yes because static method

    }
}
