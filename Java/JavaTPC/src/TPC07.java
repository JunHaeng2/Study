/*
2차원 배열
*/
import java.util.Arrays;

public class TPC07 {
   public static void main(String[] args) {
    int[] a = new int[3];
    a[0] = 10;
    a[1] = 20;
    a[2] = 30;
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
        sum += a[i];
    }
    System.out.println(sum);

    int[][] b = new int[3][3];

    int cnt = 1;

    for (int i = 0; i < b.length; i++) {
        for (int j = 0; j < b[i].length; j++) {
            b[i][j] = cnt;
            cnt++;
        }
    }

    for (int i = 0; i < b.length; i++) {
        System.out.println(Arrays.toString(b[i]));
    }
    
   } 
}
