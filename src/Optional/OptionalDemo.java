package Optional;

import javax.swing.text.html.Option;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//        String name = getName(1);     // return RAM
//        String name3 = getName(2);    // throw nullPointerException
//        if (name != null) {
//            System.out.println(name.toUpperCase());
//        }

        // Optional
        Optional<String> name2 = getName2(1);
//        if(name2.isPresent()){
//            System.out.println(name2.get().toUpperCase());
//        }

//        name2.ifPresent(x -> System.out.println(x));
//        name2.ifPresent(System.out::println);

//        String nameToBeused = name2.isPresent() ? name2.get() : "NA";
//        System.out.println(nameToBeused);

//        String na = name2.orElse("NA");
//        System.out.println(na);
//
//        String na1 = name2.orElseGet(() -> "NA");
//        System.out.println(na1);

//        String s = name2.orElseThrow(NoSuchElementException::new);
//        System.out.println(s);

       Optional<String> optional = name2.map(String::toLowerCase);
        System.out.println(optional.get());
    }

    public static String getName(int id) {
//        return "Ram";
        return null;
    }
    // Optional
    public static Optional<String> getName2(int id){
//        String name = "Ram";

//        String name = null;

//        return Optional.ofNullable(name);

//        return Optional.empty();

        return Optional.of("Shyam");
    }
}
