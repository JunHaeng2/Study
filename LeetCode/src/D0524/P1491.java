package D0524;

import java.util.Arrays;

public class P1491 {
    class Solution {
        public double average(int[] salary) {
            Arrays.sort(salary);

            double n = 0;
            for (int i = 1; i < salary.length - 1; i++) {
                n += salary[i];
            }

            return n / (salary.length - 2);
        }
    }
}
