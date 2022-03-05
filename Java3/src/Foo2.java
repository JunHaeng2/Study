public class Foo2 {
    public static void main(String[] args) {
        int baseNumber = 10;

        RunSomething runSomething =
                number -> number + baseNumber;

        System.out.println(runSomething.doIt(10));
    }
}
