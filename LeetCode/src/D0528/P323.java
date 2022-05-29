package D0528;
import java.util.*;

public class P323 {
    class Solution {
        public int countComponents(int n, int[][] edges) {
            boolean[] visited = new boolean[n];
            HashSet<Integer>[] graph = new HashSet[n];

            for (int i = 0; i < n; i++) {
                graph[i] = new HashSet<>();
            }

            for (int[] edge : edges) {
                graph[edge[0]].add(edge[1]);
                graph[edge[1]].add(edge[0]);
            }

            Queue<Integer> q = new LinkedList<>();
            int size, current;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    ++cnt;
                    visited[i] = true;
                    q.offer(i);

                    while (!q.isEmpty()) {
                        size = q.size();

                        for (int j = 0; j < size; j++) {
                            current = q.poll();

                            for (int neighbor : graph[current]) {
                                if (!visited[neighbor]) {
                                    visited[neighbor] = true;
                                    q.offer(neighbor);
                                }
                            }
                        }
                    }
                }
            }

            return cnt;
        }
    }
}
