package practice.P_chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class P2_3 {

    public static ArrayList<String> solution(int n, int[] strA, int[] strB) {

        ArrayList<String> arr = new ArrayList<>();

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] intA = new int[n];
        int[] intB = new int[n];

        for (int i = 0; i < n; i++) {
            intA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            intB[i] = sc.nextInt();
        }

        for (String s : solution(n, intA, intB)) {
            System.out.println(s);
        }
    }
}
