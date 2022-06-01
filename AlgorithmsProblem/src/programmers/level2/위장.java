package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 위장 {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < clothes.length; i++) {
                map.put(clothes[i][1],
                        map.getOrDefault(clothes[i][1], 1) + 1);
            }

            for (String key : map.keySet()) {
                answer *= map.get(key);
            }

            return answer - 1;
        }
    }
}
