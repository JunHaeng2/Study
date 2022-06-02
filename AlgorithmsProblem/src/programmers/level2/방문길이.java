package programmers.level2;

public class 방문길이 {
    static class Solution {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        public int solution(String dirs) {
            int answer = 0;
            String[] ss = dirs.split("");
            int[][] map = new int[10][10];

            int nx = 5;
            int ny = 5;
            for (int i = 0; i < ss.length; i++) {
                if (ss[i].equals("U")) {
                    nx = nx + dx[0];
                    ny = ny + dy[0];
                    if (nx < 0 && ny < 0 && nx >= 10 && ny >= 10) {
                        nx = nx - dx[0];
                        ny = ny - dy[0];
                        continue;
                    };
                    answer += count(map, nx, ny);
                }

                else if (ss[i].equals("D")) {
                    nx = nx + dx[1];
                    ny = ny + dy[1];
                    if (nx < 0 && ny < 0 && nx >= 10 && ny >= 10) {
                        nx = nx - dx[1];
                        ny = ny - dy[1];
                        continue;
                    };
                    answer += count(map, nx, ny);
                }

                else if (ss[i].equals("R")) {
                    nx = nx + dx[2];
                    ny = ny + dy[2];
                    if (nx < 0 && ny < 0 && nx >= 10 && ny >= 10) {
                        nx = nx - dx[2];
                        ny = ny - dy[2];
                        continue;
                    };
                    answer += count(map, nx, ny);
                }

                else {
                    nx = nx + dx[3];
                    ny = ny + dy[3];
                    if (nx < 0 && ny < 0 && nx >= 10 && ny >= 10) {
                        nx = nx - dx[3];
                        ny = ny - dy[3];
                        continue;
                    };
                    answer += count(map, nx, ny);
                }
            }

            return answer;
        }

        private int count(int[][] map, int nx, int ny) {
            if (map[nx][ny] == 0) {
                map[nx][ny] = 1;
                return 1;
            }
            return 0;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            System.out.println(t.solution("ULURRDLLU"));
            System.out.println(t.solution("LULLLLLLU"));

        }
    }
}
