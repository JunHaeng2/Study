package programmers.level1;

public class 부족한금액계산하기 {
    class Solution {
        public long solution(int price, int money, int count) {
            long answer = 0;
            long sum = 0;
            for (int i = 1; i < count+1; i++) {
                sum += price * i;
            }

            if (sum > money) answer = sum - money;
            return answer;
        }
    }
}
