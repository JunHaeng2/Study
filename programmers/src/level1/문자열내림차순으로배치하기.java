package level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());

//        for (String s1 : arr) {
//            System.out.println(s1);
//        }
        for (String s1 : arr) {
            answer += s1;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열내림차순으로배치하기 s = new 문자열내림차순으로배치하기();
        s.solution("Zbcdefg");
    }
}
