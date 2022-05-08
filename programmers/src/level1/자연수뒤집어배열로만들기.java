package level1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] s = str.toCharArray();
        int[] answer = new int[str.length()];
        for(int i=str.length()-1;i>=0;i--) {//뒤집어서 입력
            answer[str.length()-1-i] = str.charAt(i)-'0';
        }
        return answer;
    }


    public static void main(String[] args) {
        자연수뒤집어배열로만들기 s = new 자연수뒤집어배열로만들기();
        s.solution(12345);
    }
}
