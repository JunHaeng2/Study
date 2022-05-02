package practice.P_chapter7;

public class P7_1 {
    public static void DFS(int n) {

        // 재귀함수는 스택프레임을 사용한다고 생각하면된다.
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.println(n + " ");
        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
