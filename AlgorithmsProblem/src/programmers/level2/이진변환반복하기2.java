package programmers.level2;

public class 이진변환반복하기2 {
    class Solution {
        public int[] solution(String s) {

            // replaceAll을 생각하고 잘 사용하도록.. !
            // 꼭 만들지 않아도 되는 변수면 만들지 말기.. 괜히 코드만 복잡해짐
            int[] answer = new int[2];
            int tmp;

            while (!s.equals("1")) {
                answer[1] += s.length();
                s = s.replaceAll("0", "");
                tmp = s.length();
                s = Integer.toBinaryString(tmp);

                answer[0]++;
                answer[1] -= tmp;
            }

            return answer;
        }
    }
}
