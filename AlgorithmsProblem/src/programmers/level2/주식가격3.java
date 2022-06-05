package programmers.level2;

import java.util.Stack;

public class 주식가격3 {
    static class Solution {
        public int[] solution(int[] prices) {
            // 스택에 시간을 넣는다.. 인덱스를 고려한다고 생각하면 된다.. 인덱스 = 시간
            // 나는 이걸 생각못해서 어떻게 시간과 값을 한번에 짝지어서 넣을까를 생각했음 ㅠ
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
                answer[st.peek()] = prices.length - st.peek() - 1;
                st.pop();
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new int[]{1, 2, 3, 2, 3});
    }
}
