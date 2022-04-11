import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Function;

public class Study15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Callable, Future

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "hello";
        };

        Callable<String> java = () -> {
            Thread.sleep(3000L);
            return "Java";
        };

        Callable<String> keesum = () -> {
            Thread.sleep(1000L);
            return "keesun";
        };

//        Future<String> helloFuture = executorService.submit(hello);
//        System.out.println(helloFuture.isDone());
//        System.out.println("Started!");
//
//        helloFuture.cancel(true);
//
//        System.out.println(helloFuture.isDone());
//
//        System.out.println("End!");

//        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, java, keesum));
//        for (Future<String> f : futures) {
//            System.out.println(f.get());
//        }

        String s = executorService.invokeAny(Arrays.asList(hello, java, keesum));
        System.out.println(s);

        executorService.shutdown();
    }
}
