package practice.P_chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class P2_7 {

    public static int solution(String[] str) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (String s : str) {
            arr.add(Integer.parseInt(s));
        }

        int k = 0;
        if (arr.get(0) == 1) {
            answer += 1;
        }

        for (int i = 1; i < str.length; i++) {
            if (arr.get(i) == 1) {
                k += 1;
            } else {
                answer += k;
                k = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        arr = sc.next().split(" ");

        System.out.println(solution(arr));
    }
}
