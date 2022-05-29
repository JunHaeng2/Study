package programmers;

import java.util.*;

public class 완주하지못한선수 {
    class Solution {
        public String solution(String[] p, String[] c) {
            String answer = "";

            HashMap<String, Integer> map = new HashMap<>();
            for (String key : p) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            for (String key : c) {
                map.put(key, map.get(key) - 1);
            }

            Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

            while (iter.hasNext()) {
                Map.Entry<String, Integer> entry = iter.next();
                if (entry.getValue() != 0) {
                    answer = entry.getKey();
                    break;
                }
            }

            return answer;
        }
    }
}
