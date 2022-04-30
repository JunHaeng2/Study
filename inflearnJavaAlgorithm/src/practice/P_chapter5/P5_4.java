package practice.P_chapter5;

import java.util.Scanner;
import java.util.Stack;

public class P5_4 {

    public static int solution(String str) {
        Stack<Integer> st = new Stack<>();

        for (char c : str.toCharArray()) {

            // 공통된 부분을 사실.. 한번에 처리해주면되는데
            // 연산자인 부분에서와 숫자인 부분에서의 예외처리를 하지 못하였다.
            if (c == '*') {
               int a = st.pop();
               int b = st.pop();
               st.add(b * a);
            } else if (c == '-') {
                int a = st.pop();
                int b = st.pop();
                st.add(b - a);
            } else if (c == '+') {
                int a = st.pop();
                int b = st.pop();
                st.add(b + a);
            } else if (c == '/') {
                int a = st.pop();
                int b = st.pop();
                st.add(b / a);
            } else st.add(Integer.parseInt(String.valueOf(c)));

        }

        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
