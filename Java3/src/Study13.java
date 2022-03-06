public class Study13 {
    public static void main(String[] args) throws InterruptedException {
////        System.out.println(Thread.currentThread().getName());
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        System.out.println("hello: " + Thread.currentThread().getName());
//    }
//
//    static class MyThread extends Thread {
//        @Override
//        public void run() {
//            System.out.println("Thread: " +
//                    Thread.currentThread().getName());
//        }

//        Thread thread = new Thread(() -> {
//            try {
//                Thread.sleep(1000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Thread: " +
//                    Thread.currentThread().getName());
//        });
//        thread.start();

//        Thread thread = new Thread(() -> {
//            while (true) {
//                System.out.println("Thread: " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000L);
//                } catch (InterruptedException e) {
//                    System.out.println("interrupted!");
//                    return; // void에다가 이런식으로 리턴하면 종료
//                }
//            }
//        });

//        thread.start();
//        System.out.println("Hello: " + Thread.currentThread().getName());
//        Thread.sleep(3000L);
//        thread.interrupt();

        Thread thread = new Thread(() -> {
            System.out.println("Thread: " +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });
        thread.start();

        System.out.println("Hello: " + Thread.currentThread().getName());
        thread.join(); // 쓰레드를 기다렸다가 그 다음 라인이 시작되는거임
        System.out.println(thread + " is finished");

    }
}
