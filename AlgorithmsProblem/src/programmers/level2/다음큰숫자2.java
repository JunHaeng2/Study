package programmers.level2;

public class 다음큰숫자2 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            String s = Integer.toBinaryString(n);
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') cnt++;
            }
            int start = Integer.parseInt(s,2);

            while (true) {
                start += 1;
                String ss = Integer.toBinaryString(start);
                int ans = 0;
                for (int i = 0; i < ss.length(); i++) {
                    if (ss.charAt(i) == '1') ans++;
                }

                if (cnt == ans) {
                    answer = start;
                    break;
                }
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.solution(78));
        }
    }

}
