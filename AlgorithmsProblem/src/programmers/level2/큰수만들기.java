package programmers.level2;

public class 큰수만들기 {
    class Solution {
        public String solution(String number, int k) {
            int n = number.length();
            char[] c = new char[n];
            for (int i = 0; i < n; i++) {
                c[i] = number.charAt(i);
            }

            for (int i = 0; i < n - k; i++) {
                for (int j = i; i < n -k; j++) {

                }
            }

            return "";
        }
    }
}
