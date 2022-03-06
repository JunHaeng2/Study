import java.util.Locale;
import java.util.concurrent.*;

public class Study16 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService =
//                Executors.newFixedThreadPool(4);
//        Future<String> future = executorService.submit(() -> "hello");
//
//        // TODO
//        future.get();

        // CompletableFuture
//        CompletableFuture<String> future = new CompletableFuture<>();
//        future.complete("keesum");
//
//        System.out.println(future.get());

//        CompletableFuture<String> future = CompletableFuture.completedFuture("keesun");
//        System.out.println(future.get());

//        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//            System.out.println("hello " + Thread.currentThread().getName());
//        });
//
//        future.get();

//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Hello " + Thread.currentThread().getName());
//            return "Hello";
//        }).thenApply((s) -> {
//            System.out.println(Thread.currentThread().getName());
//            return s.toLowerCase();
//        });
//
//        System.out.println(future.get());

//        CompletableFuture<Void> future =
//                CompletableFuture.supplyAsync(() -> {
//                    System.out.println("Hello " + Thread.currentThread().getName());
//                    return "Hello";
//                }).thenAccept((s) -> {
//                    System.out.println(Thread.currentThread().getName());
//                    System.out.println(s.toUpperCase());
//                });
//
//        future.get();

//        CompletableFuture<Void> future =
//                CompletableFuture.supplyAsync(() -> {
//                    System.out.println("Hello " + Thread.currentThread().getName());
//                    return "Hello";
//                }).thenRun(() -> {
//                    System.out.println(Thread.currentThread().getName());
//        });
//
//        future.get();


    }
}
