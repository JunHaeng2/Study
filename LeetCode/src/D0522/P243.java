package D0522;

import java.util.*;

public class P243 {
    class Solution {
        public int shortestDistance(String[] wordsDict, String word1, String word2) {
            List<Integer> arr1 = new ArrayList<>();
            List<Integer> arr2 = new ArrayList<>();

            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < wordsDict.length; i++) {
                if (wordsDict[i].equals(word1)) arr1.add(i);
                else if (wordsDict[i].equals(word2)) arr2.add(i);
            }

            for (int i = 0; i < arr1.size(); i++) {
                for (int j = 0; j < arr2.size(); j++) {
                    ans = Math.min(ans, Math.abs(arr1.get(i) - arr2.get(j)));
                }
            }

            return ans;
        }
    }
}
