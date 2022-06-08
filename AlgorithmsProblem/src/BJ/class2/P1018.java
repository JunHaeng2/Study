package BJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] c = new char[n][m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String tmp = st.nextToken();
            for (int j = 0; j < m; j++) {
                c[i][j] = tmp.charAt(j);
            }
        }
    }
}
