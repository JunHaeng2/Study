package BJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] res = new int[26];
        for (int i = 0; i < 26; i++) {
            res[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (res[ch - 'a'] == -1) res[ch - 'a'] = i;
        }
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
