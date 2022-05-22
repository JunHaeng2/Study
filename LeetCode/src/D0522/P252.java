package D0522;

import java.util.*;

public class P252 {
    class Solution {
        public boolean canAttendMeetings(int[][] arr) {

            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) return o1[1] - o2[1];
                    else return o1[0] - o2[0];
                }
            });

            for (int start = 0; start < arr.length - 1; start++) {
                if (arr[start+1][0] < arr[start][1]) return false;
            }

            return true;
        }
    }
}
