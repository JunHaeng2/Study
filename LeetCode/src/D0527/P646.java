package D0527;

import java.util.*;

public class P646 {
    class Solution {
        public int findLongestChain(int[][] p) {

            Arrays.sort(p, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) return o1[1] - o2[1];
                    else return o1[0] - o2[0];
                }
            });

            int[] dp = new int[p.length];

            for (int i = 0; i < p.length; i++) {
                dp[i] = 1;

                for (int j = 0; j <= i; j++) {
                    if (p[i][0] > p[j][1]) dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            int max = 0;
            for (int i = 0; i < dp.length; i++) {
                max = Math.max(max, dp[i]);
            }

            return max;
        }
    }


}
