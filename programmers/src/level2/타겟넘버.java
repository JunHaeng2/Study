package level2;

public class 타겟넘버 {
    static int answer = 0;

    public static void DFS(int l, int sum, int[] numbers, int target) {
        // 내가 간과한 부분들.. 빼는걸 생각못함 / 마지막 위치에 도달했을때 의 answer 값도 생각해야하고, 이때 DFS가 자동적으로 멈추니까
        // return이 필요하지 않은데 공식처럼 넣으려고 했음

        if (l == numbers.length) {
            if (target == sum) answer++;
        }

        else {
            DFS(l + 1, sum + numbers[l], numbers, target);
            DFS(l + 1, sum - numbers[l], numbers, target);
        }
    }

    public static int solution(int[] numbers, int target) {
        DFS(0, 0, numbers, target);
        return answer;
    }

    public static void main(String[] args) {
        타겟넘버 s = new 타겟넘버();
        s.solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(answer);
    }
}
