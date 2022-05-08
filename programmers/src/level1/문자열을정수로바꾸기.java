package level1;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");


        if (arr[0] == "-") {
            String a = "";
            for (int i = 1; i < arr.length; i++) {
                a += arr[i];
            }
            return -Integer.parseInt(a);
        }
        else {
            return Integer.parseInt(s);
        }
    }
}
