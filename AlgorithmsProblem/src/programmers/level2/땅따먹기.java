package programmers.level2;

public class 땅따먹기 {
    class Solution {
        int solution(int[][] land) {
            int answer = 0;
            for (int i = 1; i < land.length; i++) {
                land[i][0] += maxScore(land[i-1][1], land[i-1][2], land[i-1][3]);
                land[i][1] += maxScore(land[i-1][0], land[i-1][2], land[i-1][3]);
                land[i][2] += maxScore(land[i-1][1], land[i-1][0], land[i-1][3]);
                land[i][3] += maxScore(land[i-1][1], land[i-1][2], land[i-1][0]);
            }

            for (int x : land[land.length-1]) {
                answer = Math.max(answer, x);
            }

            return answer;
        }

        private int maxScore(int a, int b, int c) {
            return Math.max(Math.max(a, b), c);
        }
    }
}
