package programmers.level2;

import java.util.Stack;

public class 올바른괄호 {
    class Solution {
        boolean solution(String s) {
            Stack<Character> st = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(') st.push(')');
                else if (c == '[') st.push(']');
                else if (c == '{') st.push('}');
                else if (st.isEmpty() || st.pop() != c) return false;
            }

            return st.isEmpty();
        }
    }
}
