package practice.P_chapter5;

import java.util.Scanner;
import java.util.Stack;

public class P5_2 {

    public static String solution(String str) {
        String answer = "";
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') st.push('(');
            else if (c == ')') st.pop();

            else if (st.isEmpty()) answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
