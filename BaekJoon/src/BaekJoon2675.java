import java.util.Scanner;

public class BaekJoon2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            Scanner in = new Scanner(System.in);
            int inNum = in.nextInt();
            String inLine = in.next();

            for (int j = 0; j < inNum; j++) {
                System.out.print(inLine);
            }
        }
    }
}
