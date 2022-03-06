import java.util.Arrays;
import java.util.List;

@chicken("양념")
@chicken("마늘간장")
public class Study18 {
    public static void main(String[] args) throws RuntimeException {
//        List<@chicken  String> names = Arrays.asList("keesun");
//    }
//
//    static class FeelsLikeChicken<@chicken T> {
//
//        public static <@chicken C> void print(@chicken C c) {
//            System.out.println(c);
//        }
//    }
//
//        chicken[] chickens = Study18.class.getAnnotationsByType(chicken.class;
//        Arrays.stream(chickens).forEach(c -> {
//            System.out.println(c.value());
//        });

        ChickenContainer chickenContainer = Study18.class.getAnnotation(ChickenContainer.class);
        Arrays.stream(chickenContainer.value()).forEach(c -> {
            System.out.println(c.value());
        });
    }
}
