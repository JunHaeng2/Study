package ch16.sec3.exam1;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.println(name);
            System.out.println(job);
        });

        person.action1(((name, job) -> System.out.println(name)));

    }
}
