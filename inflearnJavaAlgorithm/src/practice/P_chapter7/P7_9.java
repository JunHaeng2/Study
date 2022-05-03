package practice.P_chapter7;

class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

public class P7_9 {
    Node2 root;
    public static int DFS(int L, Node2 root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

    public static void main(String[] args) {
        P7_9 tree = new P7_9();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);

        System.out.println(DFS(0, tree.root));
    }
}
