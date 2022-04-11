import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Study14 {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors
//                .newSingleThreadExecutor();
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread " + Thread.currentThread().getName());
//            }
//        });
//        executorService.shutdown();

//        ExecutorService executorService1 = Executors
//                .newFixedThreadPool(2);
//        executorService1.submit(getRunnable("hello"));
//        executorService1.submit(getRunnable("keesun"));
//        executorService1.submit(getRunnable("The"));
//        executorService1.submit(getRunnable("java"));
//        executorService1.submit(getRunnable("Thread"));
//
//        executorService1.shutdown();

        ScheduledExecutorService executorService2 =
                Executors.newSingleThreadScheduledExecutor();
        executorService2.schedule(getRunnable("hello"), 5, TimeUnit.SECONDS);
    }

    private static Runnable getRunnable(String message) {
        return () -> {
            System.out.println(message + Thread.currentThread().getName());
        };
    }
}
