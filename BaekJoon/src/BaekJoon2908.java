import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        int a1 = method(a);
        int b1 = method(b);

        System.out.println(Math.max(a1, b1));
    }

    static int method(int num) {
        ArrayList arr = new ArrayList();

        String stringNum = ""+num;
        for (int i = 2; i > -1; i--) {
            arr.add(stringNum.charAt(i));
        }

        String ans = "";

        for (int i = 0; i < 3; i++) {
            ans += arr.get(i);
        }

        return Integer.parseInt(ans);
    }
}
