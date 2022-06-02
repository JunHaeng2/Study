package programmers.level2;

public class 카펫2 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            int sum = brown + yellow;
            int n;

            for (int i = 3; i <= (int) Math.sqrt(sum); i++) {
                if (sum % i == 0) {
                    n = sum / i;
                    if ((i-2) * (n-2) == yellow) {
                        answer[0] = n;
                        answer[1] = i;
                    }
                }
            }
            return answer;
        }
    }
}
