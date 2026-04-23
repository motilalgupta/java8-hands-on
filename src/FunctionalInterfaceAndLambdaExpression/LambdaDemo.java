package FunctionalInterfaceAndLambdaExpression;
//class LambdaDemo extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Child thread");
//    }
//}
class Test{
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Child Thread");
        new Thread(runnable).start();

        System.out.println("Main Thread");
    }
}
// we don't need to create another class and implement extend Thread class;