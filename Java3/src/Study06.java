public class Study06 implements Foo5 {

    String name;

    public Study06(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
