package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수2 {
    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            String[] ss = new String[numbers.length];
            boolean except = false;

            for (int i = 0; i < numbers.length; i++) {
                ss[i] = String.valueOf(numbers[i]);
                if (numbers[i] != 0) except = true;
            }

            Arrays.sort(ss, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (o2+o1).compareTo(o1+o2);
                }
            });

            for (String t : ss) {
                answer += t;
            }

            if (except) return answer;
            return "0";
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            System.out.println(t.solution(new int[]{6, 10, 2}));
        }
    }
}
