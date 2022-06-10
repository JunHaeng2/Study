package BJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String ss = br.readLine();
            boolean flag = true;

            for (int j = 0; j < ss.length(); j++) {
                if (ss.charAt(j) == '(') stack.push(')');
                else if (stack.isEmpty() || stack.pop() == '(') {
                    flag = false;
                    break;
                }
            }
            if (!stack.isEmpty()) System.out.println("NO");
            else if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
