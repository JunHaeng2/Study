package programmers;

public class 가운데글자가져오기 {
    class Solution {
        public String solution(String s) {
            if (s.length() == 1) return s;

            String answer = "";
            String[] st = s.split("");

            int mid = st.length / 2;
            if (s.length() % 2 == 0) answer += st[mid -1] + st[mid];
            else answer = st[mid];

            return answer;
        }
    }
}
