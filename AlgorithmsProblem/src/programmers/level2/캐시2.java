package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 캐시2 {
    class Solution {
        public int solution(int cacheSize, String[] cities) {
            if (cacheSize == 0) return cities.length * 5;

            int answer = 0;
            // q에서 remove는 object 삭제, linkedList에서는 인덱스 삭제..
            LinkedList<String> q = new LinkedList<>();
            for (int i = 0; i < cities.length; i++) {
                String s = cities[i].toUpperCase();
                if (q.remove(s)) {
                    answer += 1;
                    q.add(s);
                }
                else {
                    answer += 5;
                    if (q.size() >= cacheSize) q.remove(0);
                    q.add(s);
                }
            }

            return answer;
        }
    }
}
