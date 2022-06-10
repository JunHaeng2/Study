package BJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = -1;
        if (N % 5 == 0) ans = N / 5;
        else if (N % 5 == 1 ) ans = N / 5 +1;
        else if (N % 5 == 3) ans = N / 5 + 1;
        else if (N % 3 == 0) ans = N / 3;

        System.out.println(ans);
    }
}
