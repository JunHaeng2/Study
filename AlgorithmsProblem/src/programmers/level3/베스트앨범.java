package programmers.level3;

import java.util.HashMap;
import java.util.Map;

public class 베스트앨범 {
    class Solution {
        public int[] solution(String[] genres, int[] plays) {
            int[] answer = {};
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            }

            return answer;
        }
    }
}
