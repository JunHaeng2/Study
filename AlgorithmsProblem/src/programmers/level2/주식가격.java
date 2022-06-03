package programmers.level2;

public class 주식가격 {
    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                for (int j = i+1; j < prices.length; j++) {
                    if (prices[i] >= prices[j]) answer[i] = j-i;
                }
            }
            for (int i : answer) {
                System.out.print(i + " ");
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            s.solution(new int[]{1, 2, 3, 2, 3});
        }
    }
}
