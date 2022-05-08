package level1;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();

        String a = "";
        for (int i = 0; i < arr.length; i++) {

            if ((int)arr[i] >= 48 && (int)arr[i] <= 57) {
                answer += arr[i];

            } else {
                a += arr[i];
                if (a.equals("zero")) {
                    answer += "0";
                    a = "";
                }
                if (a.equals("one")) {
                    answer += "1";
                    a = "";
                }
                if (a.equals("two")) {
                    answer += "2";
                    a = "";
                }
                if (a.equals("three")) {
                    answer += "3";
                    a = "";
                }
                if (a.equals("four")) {
                    answer += "4";
                    a = "";
                }
                if (a.equals("five")) {
                    answer += "5";
                    a = "";
                }
                if (a.equals("six")) {
                    answer += "6";
                    a = "";
                }
                if (a.equals("seven")) {
                    answer += "7";
                    a = "";
                }
                if (a.equals("eight")) {
                    answer += "8";
                    a = "";
                }
                if (a.equals("nine")) {
                    answer += "9";
                    a = "";
                }
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        숫자문자열과영단어 s = new 숫자문자열과영단어();
        System.out.println(s.solution("one4seveneight"));
    }
}
