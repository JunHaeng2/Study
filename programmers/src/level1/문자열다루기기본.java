package level1;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();

        if (arr.length != 4 || arr.length != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            int c = arr[i];
            if (c < 48 || c > 57) return false;

        }

        return answer;
    }

    public static void main(String[] args) {
        문자열다루기기본 s = new 문자열다루기기본();
        s.solution("1234");
    }
}
