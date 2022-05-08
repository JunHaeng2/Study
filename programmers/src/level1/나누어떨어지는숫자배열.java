package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) arrayList.add(arr[i]);
        }

        if (arrayList.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                answer[i] = arrayList.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        나누어떨어지는숫자배열 s = new 나누어떨어지는숫자배열();
        System.out.println(s.solution(new int[]{5, 9, 7, 10}, 5));
    }
}
