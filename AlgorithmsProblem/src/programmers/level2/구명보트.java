package programmers.level2;

import java.util.Arrays;

public class 구명보트 {
    static class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            int maxWeight = 0;
            int pos = 0;
            Arrays.sort(people);

            while (true) {
                if (pos > people.length - 1) break;
                maxWeight += people[pos];
//                System.out.println(maxWeight);
                if (maxWeight > limit) {
                    answer++;
                    maxWeight = 0;
                }
                else pos++;
            }
            if (maxWeight > 0) answer++;

            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.solution(new int[]{70, 50, 80}, 100));
        }
    }
}
