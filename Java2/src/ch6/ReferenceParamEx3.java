package ch6;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        ReferenceParamEx3 r = new ReferenceParamEx3();

        int[] result = new int[] {0};

        r.add(3, 5, result);
        System.out.println(result[0]);

    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
