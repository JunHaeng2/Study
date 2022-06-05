package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class 피로도 {
    static class Solution {
        public int solution(int k, int[][] dungeons) {
            int answer = -1;
            Arrays.sort(dungeons, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] >= o2[0]) return o2[1] - o1[1];
                    else return o2[0] - o1[0];
                }
            });

            for (int i = 0; i < dungeons.length; i++) {
                System.out.print(dungeons[i][0] + " ");
                System.out.print(dungeons[i][1]);
                System.out.println();
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            s.solution(80, new int[][]{{80, 20}, {50,40}, {30,10}});
        }
    }
}
