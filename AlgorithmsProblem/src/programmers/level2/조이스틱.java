package programmers.level2;

public class 조이스틱 {
    static class Solution {
        public int solution(String name) {
            int answer = 0;
            char[] s = name.toCharArray();
            int[] n = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                n[i] = s[i] - 'A';
            }

            for (int i = 0; i < s.length; i++) {
                System.out.print(n[i] + " ");
            }



            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            s.solution("JEROEN");
        }
    }
}
