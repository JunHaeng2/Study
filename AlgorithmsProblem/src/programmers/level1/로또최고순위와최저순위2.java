package programmers.level1;

import java.util.Arrays;

public class 로또최고순위와최저순위2 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];

            Arrays.sort(lottos);
            Arrays.sort(win_nums);

            int pos = -1;
            int cnt2 = 0;
            for (int i = 0; i < lottos.length; i++) {
                if (lottos[i] != 0) {
                    pos = i;
                    break;
                }
                cnt2++;
            }

            int cnt1 = 0;
            for (int i = 0; i < lottos.length; i++) {
                if (lottos[pos+i] == win_nums[i]) cnt1++;
            }

            if (cnt1 == 6) {
                answer[0] = 1;
                answer[1] = 1;
            }
            else if (cnt1 == 5) {
                answer[0] = answer[1] - cnt2;
                answer[1] = 2;
            }
            else if (cnt1 == 4) {
                answer[0] = answer[1] - cnt2;
                answer[1] = 3;
            }
            else if (cnt1 == 3) {
                answer[0] = answer[1] - cnt2;
                answer[1] = 4;
            }
            else if (cnt1 == 2) {
                answer[0] = answer[1] - cnt2;
                answer[1] = 5;
            }
            else if (cnt1 == 1) {
                answer[0] = answer[1] - cnt2;
                answer[1] = 6;
            }
            else {
                answer[0] = answer[1] - cnt2;
                answer[1] = 6;
            }
            return answer;
        }
    }
}
