package programmers.level2;

public class 멀쩡한사각형 {
    class Solution {
        public long solution(int w, int h) {
            long wl = (long) w;
            long hl = (long) h;
            return (wl * hl) - ((wl+hl) - gcd(wl, hl));
        }

        private long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    }
}
