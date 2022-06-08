package BJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;

            char[] c = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                c[i] = s.charAt(i);
            }

            boolean flag = true;
            for (int i = 0; i < c.length / 2; i++) {
                if (c[i] != c[c.length-1-i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
