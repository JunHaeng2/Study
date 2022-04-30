package practice.P_chapter4;

import java.util.*;

public class P4_5 {

    public static int solution(int n, int k, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    ans.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer x : ans) {
            hashSet.add(x);
        }

        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(hashSet);

        if (hashSet.size() < k) return -1;
        return (Integer) hashSet.toArray()[n- k - 1];
    }

    // 0 1 2 3 4 5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        solution(n, k, arr);
         System.out.println(solution(n, k, arr));
    }
}
