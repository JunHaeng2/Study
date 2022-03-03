import java.util.Scanner;

public class BaekJoon2742 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        method(n);
    }

    static void method(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
