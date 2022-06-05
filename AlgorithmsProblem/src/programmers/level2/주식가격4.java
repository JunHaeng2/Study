package programmers.level2;

import java.util.Stack;

public class 주식가격4 {
    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < prices.length; i++) {
                while (!st.isEmpty() && prices[i] < prices[st.peek()]) {
                    answer[st.peek()] = i - st.peek();
                    st.pop();
                }
                st.add(i);
            }

            while (!st.isEmpty()) {
                answer[st.peek()] = prices.length-1-st.peek();
                st.pop();
            }

            return answer;
        }
    }
}
