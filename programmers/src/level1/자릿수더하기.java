package level1;

public class 자릿수더하기 {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 T = new 자릿수더하기();
        System.out.println(T.solution("123"));
    }
}

