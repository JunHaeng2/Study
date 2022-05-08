package level1;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        int max = a > b ? a : b;
        int min = a > b ? b : a;
        if (a == b) return a;
        else {
            for (int i = min; i <= max; i++) {
                answer += i;
            }
        }

        return answer;
    }
}
