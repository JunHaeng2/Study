package programmers;

public class 나머지가1이되는수찾기 {
    class Solution {
        public int solution(int n) {
            for (int i = 2; i < n+1; i++) {
                if ((n % i) == 1) return i;
            }

            return -1;
        }
    }
}
