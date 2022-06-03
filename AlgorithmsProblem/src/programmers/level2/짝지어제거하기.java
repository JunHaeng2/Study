package programmers.level2;

import java.util.Stack;

public class 짝지어제거하기 {
    static class Solution {
        public int solution(String s) {

            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (st.size() != 0 && st.peek() == s.charAt(i)) st.pop();
                else st.add(s.charAt(i));
            }

            if (st.size() == 0) return 1;
            return 0;
        }

        public static void main(String[] args) {
            Solution s = new Solution();

        }
    }
}
