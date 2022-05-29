package programmers;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];

            Arrays.sort(lottos);
            Arrays.sort(win_nums);

            int cnt1 = 0;
            int cnt2 = 0;

            for (int i = 0; i < lottos.length; i++) {
                if (lottos[i] == 0) cnt2++;
                if (lottos[i] == win_nums[0]) cnt1++;
            }

            if (cnt1 == 6) {
                answer[0] = 1;
                answer[1] = 1;
            }
            if (cnt1 == 5) {
                answer[0] = 2;
                answer[1] = answer[0] - cnt2;
            }
            if (cnt1 == 4) {
                answer[0] = 3;
                answer[1] = answer[0] - cnt2;
            }
            if (cnt1 == 3) {
                answer[0] = 4;
                answer[1] = answer[0] - cnt2;
            }
            if (cnt1 == 2) {
                answer[0] = 5;
                answer[1] = answer[0] - cnt2;
            }
            else {
                answer[0] = 6;
                answer[1] = answer[0] - cnt2;
            }

            return answer;
        }
    }
}
