package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            String[] ss = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                ss[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(ss);
            for (int i = 0; i < ss.length; i++) {
                System.out.println(ss[i]);
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            t.solution(new int[]{3, 30, 34, 5, 9});
        }
    }
}
