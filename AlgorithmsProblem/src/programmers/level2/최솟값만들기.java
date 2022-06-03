package programmers.level2;

import java.util.*;

public class 최솟값만들기 {
    class Solution {
        public int solution(int[] A, int[] B) {
            int answer = 0;
            Integer[] b = new Integer[B.length];

            for (int i = 0; i < b.length; i++) {
                b[i] = B[i];
            }
            Arrays.sort(A);
            Arrays.sort(b, Comparator.reverseOrder());

            for (int i = 0; i < A.length; i++) {
                answer += A[i] * b[i];
            }

            return answer;
        }
    }
}
