package programmers.level2;

public class p2개이하로다른비트 {
    class Solution {
        public long[] solution(long[] numbers) {
            long[] answer = new long[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                String binary = Integer.toBinaryString((int) numbers[i]);

            }

            return answer;
        }
    }
}
