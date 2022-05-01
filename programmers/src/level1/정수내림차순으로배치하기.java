package level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        String[] nArr = String.valueOf(n).split("");
        Arrays.sort(nArr);

        StringBuilder sb = new StringBuilder();
        for (int i = nArr.length - 1; i >= 0; i--) sb.append(nArr[i]);

        return Long.parseLong(sb.toString());
    }
}
