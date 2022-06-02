package programmers.level2;

import java.util.ArrayList;
import java.util.List;

// 메모리 초과.. !
public class N2배열자르기 {
    static class Solution {
        public int[] solution(int n, long left, long right) {
            int len = (int) (right - left) + 1;
            int[] answer = new int[len];
            List<Integer> res = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res.add(Math.max(i, j) + 1);
                }
            }

            for (int i = 0; i < len; i++) {
                answer[i] = res.get((int)(i+left));
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            t.solution(3, 2 ,5);
        }
    }
}
