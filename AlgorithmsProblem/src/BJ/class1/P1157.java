package BJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();
        int[] arr = new int[26];

        for (char c : s.toCharArray()) {
            int idx = c - 'A';
            arr[idx]++;
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String res = "";
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) res += (char) (i + 65);
        }

        if (res.length() >= 2) System.out.println("?");
        else System.out.println(res);
    }
}
