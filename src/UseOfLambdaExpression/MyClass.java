package UseOfLambdaExpression;

public class MyClass implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<=5; i++){
            System.out.println("child thread");  // before lambda expression
        }
    }
}
class TestRunnable {
    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        Thread t = new Thread(myClass);   // before lambda expression
//        t.start();

        Runnable runnable = () -> {
            for(int i = 1; i<=5; i++){
                System.out.println("child thread");     // after lambda expression
            }                                           // Don't need to create implementation class
        };
        new Thread(runnable).start();
    }
}
