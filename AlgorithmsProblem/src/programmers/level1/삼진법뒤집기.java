package programmers.level1;

public class 삼진법뒤집기 {
    class Solution {
        public int solution(int n) {
            int res = 0;
            String ans = "";

            while (n > 0) {
                ans = (n % 3) + ans;
                n /= 3;
            }

            String[] s = ans.split("");
            for (int i = 0; i < s.length; i++) {
                res += Integer.parseInt(s[i]) * Math.pow(3, i);
            }
            return res;
        }
    }
}
