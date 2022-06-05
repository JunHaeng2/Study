package programmers.level2;

public class 이진변환반복하기 {
    static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[2];
            int cnt1 = 0;
            int cnt2 = 0;
            String ans = "";

            while (true) {
                if (ans.equals("1")) break;
                cnt2++;
                ans = "";
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0') cnt1++;
                    if (s.charAt(i) == '1') ans += "1";
                }
                s = Integer.toBinaryString(ans.length());
            }

            answer[1] = cnt1;
            answer[0] = cnt2;
//            System.out.println(answer[0]);
//            System.out.println(answer[1]);

            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            s.solution("110010101001");
        }
    }
}
