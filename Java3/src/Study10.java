import java.util.*;

public class Study10 {
    public static void main(String[] args) {
        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot", true));
        springClass.add(new OnlineClass(5, "reset api development", false));

        Optional<OnlineClass> optional = springClass.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

//        boolean present = optional.isPresent();
//        System.out.println(present);

//        OnlineClass onlineClass = optional.get();
//        System.out.println(onlineClass.getTitle());

        // if를 사용하지 않고도.. !

//        optional.ifPresent(oc -> {
//            System.out.println(oc.getTitle());
//        });
//
//        OnlineClass onlineClass = optional.orElseGet(
//                () -> createNewClass());
//        System.out.println(onlineClass.getTitle());
//
//        OnlineClass onlineClass1 = optional.orElseThrow(
//                () -> {
//                    return new RuntimeException();
//                }
//        );

//        Optional<OnlineClass> onlineClass = optional
//                .filter(oc -> !oc.isClosed());
//
//        System.out.println(onlineClass.isEmpty());

//        Optional<Optional> integer = optional.map(OnlineClass::getProgress);
//        Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress);

    }

//    private static OnlineClass createNewClass() {
//        System.out.println("creating new online class");
//        return new OnlineClass(10, "New class", false);
//    }
}
