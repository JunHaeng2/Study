package programmers.level2;

public class 카펫 {
    static class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            int ans = brown + yellow;
            double sqrt = Math.sqrt(ans);

            if (sqrt == (int) sqrt) {
                answer[0] = (int) sqrt;
            }
            else {
                answer[0] = ans / (int) sqrt;
            }
            answer[1] = (int) sqrt;

            return answer;
        }

        public static void main(String[] args) {
            Solution d = new Solution();
            System.out.println(d.solution(8, 1));
            d.solution(3, 3);
        }
    }
}
