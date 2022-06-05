package programmers.level1;

public class 비밀지도2 {
    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            int[][] map = new int[n][n];
            for (int i = 0; i < n; i++) {
                String a1 = Integer.toBinaryString(arr1[i]);
                String a2 = Integer.toBinaryString(arr2[i]);

                for (int j = a1.length() - 1; j >= 0; j--) {
                    map[i][j] = a1.charAt(j) - '0';
                }
                for (int j = a2.length() - 1; j >= 0; j--) {
                    if (map[i][j] == 1) continue;
                    map[i][j] = a2.charAt(j) - '0';
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < n; i++) {
                String ans = "";
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1) ans += "#";
                    else ans += " ";
                }
                answer[i] = ans;
            }

//            for (String x : answer) {
//                System.out.println(x);
//            }
            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            s.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        }
    }
}
