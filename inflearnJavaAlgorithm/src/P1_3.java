import java.util.Scanner;

public class P1_3 {

    public static String solution(String s) {
        String[] ArrayStr = s.split(" ");

        String ans = ArrayStr[0];

        for (String a : ArrayStr) {
            if (a.length() > ans.length()) {
                ans = a;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(s);
    }
}
