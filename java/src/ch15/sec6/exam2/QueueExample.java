package ch15.sec6.exam2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> q = new LinkedList<>();
        q.offer(new Message("dd", "dd"));

        while (!q.isEmpty()) {
            Message message = q.poll();

        }
    }
}
