package programmers;

import java.util.Arrays;

public class 예산 {
    static class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;
            Arrays.sort(d);

            for (int cost : d) {
                if (budget - cost < 0) break;
                budget -= cost;
                answer++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        t.solution(new int[]{2,2,3,3}, 10);
    }
}
