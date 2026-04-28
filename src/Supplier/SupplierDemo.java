package Supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 20;
        System.out.println(supplier.get());
    }
}
