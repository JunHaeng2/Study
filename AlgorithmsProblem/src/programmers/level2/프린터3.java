package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터3 {
    class Solution {
        class Task {
            int location;
            int priority;

            private Task(int location, int priority) {
                this.location = location;
                this.priority = priority;
            }
        }

        public int solution(int[] priorities, int location) {
            int answer = 0;

            Queue<Task> q = new LinkedList<>();
            for (int i = 0; i < priorities.length; i++) {
                q.add(new Task(i, priorities[i]));
            }

            int now = 0;
            while (!q.isEmpty()) {
                Task cur = q.poll();
                boolean flag = false;
                for (Task t : q) {
                    if (t.priority > cur.priority) flag = true;
                }

                if (flag) q.add(cur);
                else {
                    now++;
                    if (cur.location == location) {
                        answer = now;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
