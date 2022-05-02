import java.util.Scanner;

public class BaekJoon11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String[] arr = s.split("");
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }

        System.out.println(answer);
    }
}
