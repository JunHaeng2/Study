public class Foo {
    public static void main(String[] args) {

        // 익명 내부 클래스
        RunSomething runSomething = (number) -> {
            return number + 10;
        };

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));

        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));
    }
}
