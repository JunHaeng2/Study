import java.util.*;
import java.util.stream.Collectors;

public class Study07 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

/*        name.forEach(System.out::println);

        for (String n : name) {
            System.out.println(n);
        }*/

//        Spliterator<String> spliterator = name.spliterator();
//        Spliterator<String> spliterator1 = spliterator.trySplit();
//        while(spliterator.tryAdvance(System.out::println));
//        System.out.println("==========");
//        while(spliterator1.tryAdvance(System.out::println));

//        name.stream().map(String::toUpperCase)
//                .filter(s -> s.startsWith("K"))
//                .collect(Collectors.toSet());

//        name.removeIf(s -> s.startsWith("k"));
//
//        name.forEach(System.out::println);

//        Comparator<String> compareToIgnoreCase =
//                String::compareToIgnoreCase;
//
//        name.sort(compareToIgnoreCase.reversed().thenComparing());
//        name.forEach(System.out::println);


    }
}
