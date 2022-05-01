package level1;

import java.util.ArrayList;

public class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for (char c : s.toCharArray()) {
            cnt++;
            if (cnt % 2 != 0) answer += Character.toUpperCase(c);
            else if (cnt % 2 == 0 && cnt != 0) answer += c;
            else if (c == ' ') cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        이상한문자만들기 T = new 이상한문자만들기();
        System.out.println(T.solution("try hello world"));
    }
}
