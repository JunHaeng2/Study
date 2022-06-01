package programmers.level1;

public class 비밀지도 {
    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            String[][] arr = new String[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = " ";
                }
            }

            for (int i = 0; i < arr1.length; i++) {
                String binary1 = Integer.toBinaryString(arr1[i]);
                String[] s1 = binary1.split("");
                String binary2 = Integer.toBinaryString(arr2[i]);
                String[] s2 = binary2.split("");


            }

            for (int i = 0; i < arr.length; i++) {
                String res = "";
                for (int j = 0; j < arr.length; j++) {
                    res += arr[i][j];
                }
                answer[i] = res;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        t.solution(n, arr1, arr2);
    }
}
