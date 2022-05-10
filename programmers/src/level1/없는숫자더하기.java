package level1;

import java.util.HashMap;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            hashMap.put(i, 0);
        }

        for (int i = 0; i < numbers.length; i++) {
            hashMap.put(numbers[i], hashMap.get(numbers[i]) + 1);
        }

        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) != 1) {
                answer += key;
            }
        }

        return answer;
    }
}
