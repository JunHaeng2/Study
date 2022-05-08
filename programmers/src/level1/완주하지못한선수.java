package level1;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            hashMap1.put(participant[i], hashMap1.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            hashMap2.put(completion[i], hashMap2.getOrDefault(completion[i], 0) + 1);
        }

        for (String key : hashMap1.keySet()) {
            if (!hashMap2.containsKey(key)) answer += key;
            else if (hashMap1.get(key) != hashMap2.get(key)) answer += key;
        }

        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 0, 12}};

        Math.sqrt(Math.pow((2 - 0), (3 - 0)));

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(Math.pow((2 - 0), (3 - 0))));

    }
}
