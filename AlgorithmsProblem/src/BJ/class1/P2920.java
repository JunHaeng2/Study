package BJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int cnt = 0;
        for (int i = 0; i < s.length - 1; i++) {
            if (Integer.parseInt(s[i]) > Integer.parseInt(s[i+1])) cnt--;
            else if(Integer.parseInt(s[i]) < Integer.parseInt(s[i+1])) cnt++;
        }
        if (cnt == 7) System.out.println("ascending");
        else if (cnt == -7) System.out.println("descending");
        else System.out.println("mixed");
    }
}
