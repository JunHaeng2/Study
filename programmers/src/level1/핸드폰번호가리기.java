package level1;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();
        int l = phone_number.length();

        for (int i = 0; i <= l -5; i++) {
            answer += '*';
        }

        for (int i = l -4; i < l; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
