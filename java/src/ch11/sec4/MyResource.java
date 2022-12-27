package ch11.sec4;

public class MyResource implements AutoCloseable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println();
    }

    public String read1() {
        System.out.println();
        return "100";
    }

    public String read2() {
        System.out.println();
        return "abc";
    }
    @Override
    public void close() throws Exception {
        System.out.println();
    }
}
