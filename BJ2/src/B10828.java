import java.util.Scanner;

public class B10828 {
    public static void push(int x) {

    }

    public static void pop() {

    }

    public static void size() {

    }

    public static void empty() {

    }

    public static void top() {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String tmp1 = sc.next();
            if (tmp1.equals("push")) {
                int tmp2 = sc.nextInt();
                push(tmp2);
            } ////
        }
    }
}
