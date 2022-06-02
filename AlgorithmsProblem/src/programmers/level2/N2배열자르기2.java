package programmers.level2;

public class N2배열자르기2 {
    class Solution {
        public int[] solution(int n, long left, long right) {
            int len = (int) right - (int) left;
            int[] answer = new int[len + 1];
            int idx = 0;
            for (long i = left; i <= right; i++) {
                answer[idx++] = Math.max((int) (i / n), (int) (i % n)) + 1;
            }

            return answer;
        }
    }
}
