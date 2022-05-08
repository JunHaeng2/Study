package level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) continue;
            else ans.add(arr[i]);
        }

        answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }
}
