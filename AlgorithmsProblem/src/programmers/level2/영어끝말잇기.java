package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class 영어끝말잇기 {
    static class Solution {
        public int[] solution(int n, String[] words) {
            // 다시풀어보기.. !
            int[] answer = new int[2];
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < words.length; i++) {
                map.put(words[i], map.getOrDefault(words[i], 0) + 1);
                if (map.get(words[i]) == 2) {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                }

                if (i != 0 && words[i-1].charAt(words[i-1].length() -1)
                != words[i].charAt(0)) {
                    answer[1] = i / n + 1;
                    answer[0] = i % n + 1;
                }
            }
//            System.out.println(answer[0]);
//            System.out.println(answer[1]);
            return answer;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            t.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        }
    }
}
