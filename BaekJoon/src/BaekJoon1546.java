import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class BaekJoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cnt = br.readLine();
        String[] str = br.readLine().split(" ");

        int ArrLength = Integer.parseInt(cnt);
        Double[] DoubleArr = new Double[ArrLength];

        for (int i = 0; i < ArrLength; i++) {
            DoubleArr[i] = Double.parseDouble(str[i]);
        }
        Arrays.sort(DoubleArr);
        Double maxDoubleArr = DoubleArr[DoubleArr.length-1];

        Double sumDoubleArr = null;

        for (int i = 0; i < ArrLength; i++) {
            DoubleArr[i] = DoubleArr[i] / maxDoubleArr * 100;
        }

        Double sum = Arrays.stream(DoubleArr).parallel().
                reduce(0.0, (a,b) -> a + b);

        System.out.println(sum / ArrLength);
    }
}
