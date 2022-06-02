package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class 최댓값과최솟값 {
    // ListArray를 사용하지말고, 바로바로 min/max값을 구해서 넣어주면된다.
    static class Solution {
        public String solution(String s) {
            String answer = "";
            String[] ss = s.split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < ss.length; i++) {
                arr.add(Integer.parseInt(ss[i]));
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.size(); i++) {
                min = Math.min(min, arr.get(i));
                max = Math.max(max, arr.get(i));
            }
            answer += min + " " + max;

            return answer;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            System.out.println(t.solution("-1 -2 -3 -4"));
        }
    }
}
