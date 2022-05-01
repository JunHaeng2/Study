package level1;

public class 이상한문자만들기_1 {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for (String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        이상한문자만들기_1 T = new 이상한문자만들기_1();
        System.out.println(T.solution("try hello world"));
    }
}
