package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> q = new LinkedList<>();
            int time = 0;
            int qWeight = 0;
            int pos = 0;

            while (true) {
                if (pos > truck_weights.length) break;

                if (q.size() < bridge_length) {
                    qWeight = 0;
                    for (int k : q) {
                        qWeight += k;
                    }
                    if (qWeight + truck_weights[pos] > weight) {
                        q.poll();
                        time += 1;
                    }
                    else {
                        q.add(truck_weights[pos]);
                        time += 1;
                        pos += 1;
                    }
                }
                else {
                    time += 1;
                    q.poll();
                }
            }

            return time;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.solution(2, 10, new int[]{
                    7, 4, 5, 6}
            ));
        }
    }
}
