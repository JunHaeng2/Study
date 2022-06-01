package programmers.level2;

public class JadenCase문자열만들기 {
    static class Solution {
        public String solution(String s) {
            String answer = "";
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (i == 0) {
                    if (c[i] >= 97 && c[i] <= 122) {
                        c[i] = upperCase(c[i]);
                    }
                }

                else if (c[i-1] == ' ' && c[i] != ' ') {
                    c[i] = upperCase(c[i]);
                }

                else if (!(c[i] >= 48 && c[i] <= 57)) {
                    c[i] = lowerCase(c[i]);
                }
            }
            for (char word : c) {
                answer += word;
            }

            return answer;
        }

        private char upperCase(char c) {
            char tmp = Character.toUpperCase(c);
            return tmp;
        }

        private char lowerCase(char c) {
            char tmp = Character.toLowerCase(c);
            return tmp;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            System.out.println(t.solution("3people unFollowed me"));
            System.out.println(t.solution("for the last week"));
        }
    }
}
