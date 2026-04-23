package FunctionalInterfaceAndLambdaExpression;

@FunctionalInterface
public interface InterfaceDemo {
    int add(int a, int b);
}
class Driver{
    public static void main(String[] args) {
        InterfaceDemo fninterface = (a,b) -> (a+b);
        System.out.println("The sum is: "+fninterface.add(3,2));
    }
}
