package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class N진수게임 {
    static class Solution {
        public String solution(int n, int t, int m, int p) {
            String answer = "";
            String tmp = "";
            p = p -1;

            List<String> ss = new ArrayList<String>();
            while (true) {
                if (answer.length() == t) break;
                if (tmp.length() < p) {

                }

            }

            return answer;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            System.out.println(t.solution(2, 4, 2, 1));
        }
    }
}
