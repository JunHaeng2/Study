package programmers.level2;

public class 다음큰숫자 {
    static class Solution {
        public int solution(int n) {
            int ans = 0;

            String res = "";
            while (n > 0) {
                res = res + (n % 2);
                n = n / 2;
            }

            int answer = count(res);
            String isSame = "";
            while (true) {
                n += 1;
                while (n > 0) {
                    isSame += isSame + (n % 2);
                    n = n / 2;
                }

                if (answer == count(isSame)) {
                    ans = n;
                    break;
                }
            }

            return ans;
        }

        private int count(String res) {
            String[] ss = res.split("");
            int cnt = 0;
            for (String s : ss) {
                if (s.equals("1")) cnt++;
            }

            return cnt;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            System.out.println(t.solution(78));
        }
    }
}
