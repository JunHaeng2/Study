package BJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int n = num % 42;
            if (!arr.contains(n)) arr.add(n);
        }

        System.out.println(arr.size());
    }
}
