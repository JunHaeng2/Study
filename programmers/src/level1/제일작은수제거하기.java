package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 제일작은수제거하기 {

    static class Solution {
        public int[] solution(int[] arr) {


            ArrayList<Integer> ans = new ArrayList<>();
            for (int i=0; i<arr.length; i++) {
                ans.add(arr[i]);
            }

            int min = Integer.MAX_VALUE;
            for (int i=0; i<ans.size(); i++) {
                if (ans.get(i) < min) min = ans.get(i);
            }

            ans.remove(ans.indexOf(min));

            int[] answer;
            if (ans.size() == 0) {
                answer = new int[1];
                answer[0] = -1;
            } else {
                answer = new int[ans.size()];
                for (int i=0; i<ans.size(); i++) {
                    answer[i] = ans.get(i);
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();

        for (int i : s.solution(arr)) {
            System.out.println(i);
        }
    }
}
