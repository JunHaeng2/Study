package programmers.level2;

public class 점프와순간이동 {
    static public class Solution {
        public int solution(int n) {
            if (n <= 2) return 1;
            int ans = 0;

            while (n >= 1) {
                if (n % 2 == 0) n = n / 2;
                else {
                    n = n - 1;
                    ans++;
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.solution(5));
        }
    }
}
