package programmers.level2;

public class 주식가격2 {
    static class Solution {
        // 역시 이중포문으로 풀면 시간초과가 날수밖에없음
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            int tmp = 0;

            for (int i = 0; i < prices.length; i++) {
                boolean flag = false;
                for (int j = i+1; j < prices.length; j++) {
                    if (prices[i] > prices[j]) {
                        flag = true;
                        tmp = j-i;
                        break;
                    }
                }
                if (flag) answer[i] = tmp;
                else answer[i] = prices.length-i-1;
            }

            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i] + " ");
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new int[]{1, 2, 3, 2, 3});
    }
}
