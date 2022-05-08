package level1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        if (arr.length % 2 == 0) {
            answer += arr[arr.length];
        }

        return answer;
    }
}
