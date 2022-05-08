package level2;

import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class queue {
    int progresses, speeds;
    queue(int progresses, int speeds) {
        this.progresses =progresses;
        this.speeds =speeds;
    }
}

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();

        Queue<queue> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            q.offer(new queue(progresses[i], speeds[i]));
        }
//        for (queue queue : q) {
//            System.out.print(queue.progresses + " ");
//            System.out.print(queue.speeds);
//            System.out.println();
//        }
//
//        System.out.println(q.peek().progresses);

        while(!q.isEmpty()) {
            int cnt = 0;
            for (queue queue : q) {
                queue.progresses += queue.speeds;
            }

            while (q.peek().progresses >= 100) {
                q.poll();
                cnt++;
            }
            if (cnt != 0) {
                arr.add(cnt);
            }
        }

        System.out.println(arr);

        return answer;
    }

    public static void main(String[] args) {
        기능개발 s = new 기능개발();
        s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
    }
}
