import java.util.Scanner;

public class BaekJoon2741 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        print(n);
    }

    static void print(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.println(i);
        }
    }
}

