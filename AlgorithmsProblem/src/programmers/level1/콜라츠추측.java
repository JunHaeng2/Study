package programmers.level1;

public class 콜라츠추측 {
    class Solution {
        public int solution(int num) {
            return helper(num);
        }

        private int helper(int n) {
            int cnt = 0;
            while (n != 1) {
                cnt++;
                if (n % 2 == 0) n /= 2;
                else if (n % 2 != 0) n = n * 3 + 1;

                if (cnt >= 500) return -1;
            }
            return cnt;
        }
    }
}
