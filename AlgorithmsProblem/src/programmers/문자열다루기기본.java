package programmers;

public class 문자열다루기기본 {
    class Solution {
        public boolean solution(String s) {
            char[] c = s.toCharArray();

            for (char key : c) {
                int newKey = key - '0';
                if (newKey < 0 || newKey > 9) return false;
            }

            if (c.length == 4 || c.length == 6) return true;
            return false;
        }
    }

    class Solution2 {
        private boolean solution(String s) {
            if (s.length() == 4 || s.length() == 6) {
                try {
                    int x =Integer.parseInt(s);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
            return false;
        }
    }
}
