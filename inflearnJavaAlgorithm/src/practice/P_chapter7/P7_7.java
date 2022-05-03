package practice.P_chapter7;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
    int data;
    Node1 lt, rt;
    public Node1(int val) {
        data = val;
        lt = rt = null;
    }
}

public class P7_7 {
    Node1 root;
    public void BFS(Node1 root) {
        Queue<Node1> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : " );
            for (int i = 0; i < len; i++) {
                Node1 current = Q.poll();
                System.out.print(current.data + " ");
                if (current.lt != null) Q.offer(current.lt);
                if (current.rt != null) Q.offer(current.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P7_7 tree = new P7_7();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        tree.root.rt.lt = new Node1(6);
        tree.root.rt.rt = new Node1(7);
        tree.BFS(tree.root);
    }
}