import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class Study17 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        boolean throwError = false;

        CompletableFuture<String> hello =
                CompletableFuture.supplyAsync(() -> {
                    if (throwError) {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("Hello " + Thread.currentThread().getName());
                    return "Hello";
                }).exceptionally(ex -> {
                    System.out.println(ex);
                    return "Error!";
                });

        System.out.println(hello.get());

//        CompletableFuture<String> future = hello.thenCompose(Study17::getWorld);
//        System.out.println(future.get());

//        CompletableFuture<String> world =
//                CompletableFuture.supplyAsync(() -> {
//                    System.out.println("World " + Thread.currentThread().getName());
//                    return "World";
//                });

//        CompletableFuture<String> future = hello.thenCombine(world, (h, w) -> {
//            return h + " " + w;
//        });
//
//        System.out.println(future.get());

//        List<CompletableFuture> futures = Arrays.asList(hello, world);
//        CompletableFuture[] futuresArray = futures.toArray(new CompletableFuture[futures.size()]);
//
//        CompletableFuture<List<Object>> results = CompletableFuture
//                .allOf(futuresArray).thenApply(v -> futures
//                        .stream().map(CompletableFuture::join)
//                        .collect(Collectors.toList()));
//
//        results.get().forEach(System.out::println);

//        CompletableFuture<Void> voidCompletableFuture =
//                CompletableFuture.anyOf(hello, world).thenAccept(System.out::println);
//
//        voidCompletableFuture.get();
    }
//
//    private static CompletableFuture<String> getWorld(String message) {
//        return CompletableFuture.supplyAsync(() -> {
//            System.out.println("Wolrd" + Thread.currentThread().getName());
//            return message + "World";
//        });
//    }
}
