package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class 더맵게 {
    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;

            Integer[] res = new Integer[scoville.length];
            for (int i = 0; i < scoville.length; i++) {
                res[i] = scoville[i];
            }
            Arrays.sort(res, Comparator.reverseOrder());



            return answer;
        }
    }
}
