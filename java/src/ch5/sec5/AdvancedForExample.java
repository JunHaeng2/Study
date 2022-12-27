package ch5.sec5;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        System.out.println(sum);
    }
}
