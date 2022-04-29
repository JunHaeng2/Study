package practice.P_chapter2;

import java.util.Scanner;

public class P2_6 {

    public static boolean sosu(int tmp, int sqrtTmp) {
        for (int j = 1; j <= sqrtTmp; j++) {
            if (j != 1) {
                if ((tmp % j) == 0) return false;
            }
        }

        return true;
    }

    public static String solution(int n, String[] str) {
        String answer = "";

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(str[i]);
            String reverse = sb.reverse().toString();
            int tmp = Integer.parseInt(reverse);
            int sqrtTmp = (int) Math.sqrt(tmp);

            if (sosu(tmp, sqrtTmp) && tmp != 1) {
                answer += tmp + " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        System.out.println(solution(n, str));
    }
}
