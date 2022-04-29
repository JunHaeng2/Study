package practice.P_chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class P1_10_1 {

    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];

        ArrayList<Character> arr = new ArrayList<>();
        for (char c : s.toCharArray()) {
            arr.add(c);
        }

        for (int i = 0; i < arr.size(); i++) {

            int pos = 101;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == t) {
                    if (pos > Math.abs(i - j)) {
                        pos = Math.abs(i - j);
                    }
                }
            }
            answer[i] = pos;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // sdfsdf e 이런식 입력받을때
        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
