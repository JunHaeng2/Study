import java.time.Duration;
import java.util.*;

public class Study09 {
    public static void main(String[] args) {
        List<OnlineClass> springclass = new ArrayList<>();
        springclass.add(new OnlineClass(1, "spring boot", true));
        springclass.add(new OnlineClass(2, "spring data java", true));
        springclass.add(new OnlineClass(3, "spring mvc", false));
        springclass.add(new OnlineClass(4, "spring core", false));
        springclass.add(new OnlineClass(5, "rest api development", false));

        OnlineClass spring_boot =
                new OnlineClass(1, "spring boot", true);

        Optional<Progress> progress = spring_boot.getProgress();

    }
}
