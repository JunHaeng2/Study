package level1;

import java.util.Locale;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        s.toLowerCase();
        String[] arr = s.split("");
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().equals("p")) c1++;
            if (arr[i].toLowerCase().equals("y")) c2++;
        }

        if (c1 == c2) return true;
        else return false;
    }
}
