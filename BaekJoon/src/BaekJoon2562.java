import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i=0; i < 9; i++) {
            arr.add(sc.nextInt());
        }

        int tmp = 0;
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i) > tmp) {
                tmp = arr.get(i);
            }
        }

        System.out.println(tmp);
        System.out.println(arr.indexOf(tmp) + 1);
    }
}
