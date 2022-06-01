package programmers.level2;

public class JadenCase문자열만들기2 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] sp = s.toLowerCase().split("");
            boolean flag = true;

            for (String ss : sp) {
                answer += flag ? ss.toUpperCase() : ss;
                flag = ss.equals(" ");
            }

            return answer;
        }
    }
}
