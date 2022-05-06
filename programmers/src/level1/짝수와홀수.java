package level1;

import java.util.Scanner;

class Solution {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) answer += "Even";
        else answer += "Odd";
        return answer;
    }
}

public class 짝수와홀수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution s = new Solution();
        System.out.println(s.solution(n));
    }
}
