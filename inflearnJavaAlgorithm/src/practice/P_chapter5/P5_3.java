package practice.P_chapter5;

import java.util.Scanner;
import java.util.Stack;

public class P5_3 {

    public static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!st.isEmpty() && tmp == st.peek()) {
                        answer += 2;
                        st.pop();
                    } else st.push(tmp);

                    // break를 하지 않아서, 계속 그 moves에서 뽑았던거 같음
                    break;
                }
            }
        }

//        for (int j = 0; j < m; j++) {
//            int step = moves[j];
//
//            for (int i = 0; i < n; i++) {
//                if (!st.isEmpty()) {
//                    if (board[i][step] != 0) {
//
//                        if (st.peek() == board[i][step]) {
//                            st.pop();
//                            answer += 2;
//                        } else st.add(board[i][step]);
//
//                        board[i][step] = 0;
//                    }
//                } else {
//                    st.add(board[i][step]);
//                } break;
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

//        solution(n, arr1, m, arr2);
        System.out.println(solution(n, arr1, m, arr2));
    }
}
