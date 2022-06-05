package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
    static class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;
            int max = Integer.MIN_VALUE;

            Queue<int[]> q = new LinkedList<>();
            for (int i = 0; i < priorities.length; i++) {
                q.offer(new int[]{i, priorities[i]});
                max = Math.max(max, priorities[i]);
            }

            // 5 1 9 1 1 1
            // 1 9 1 1 1 5
            // 9 1 1 1 5 1
            // 1 1 1 5 1
            // 1 1 5 1
            // 1 5 1
            // 5 1
            // 1

            while (true) {
                if (q.isEmpty()) break;

                int[] tmp = q.peek();
                System.out.println(tmp[1]);
                if (tmp[1] < max) q.offer(q.poll());
                if (tmp[1] >= max) {
                    answer++;
                    if (tmp[0] == location) break;
                    else q.poll();

                    max = Integer.MIN_VALUE;
                    for (int i = 0; i < q.size(); i++) {
                        max = Math.max(tmp[1], max);
                    }
                }
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.solution(new int[]{1, 1, 9, 1, 1}, 0));
        }
    }
}
