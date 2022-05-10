package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int tmp = numbers[i] + numbers[j];
                if (!arrayList.contains(tmp)) arrayList.add(tmp);
            }
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

}
