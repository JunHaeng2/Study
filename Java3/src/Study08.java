import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Study08 {
    public static void main(String[] args) {

        // stream은 데이터를 담는 저장소가 아니라
        // 데이터를 가지고 처리하는 방식정도로 생각?
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteShip");
        names.add("toby");
        names.add("foo");


        Stream<String> stringStream =
                names.stream().map(String::toUpperCase);


//        List<String> collect = names.stream().map((s) -> {
//            System.out.println(s);
//            return s.toUpperCase();
//        }).collect(Collectors.toList());
//
//        System.out.println(collect);
//
//        System.out.println("===========");
//
//        names.forEach(System.out::println);

//        List<String> collect = names.parallelStream().map(String::toUpperCase)
//                .collect(Collectors.toList());
//        collect.forEach(System.out::println);


    }
}
