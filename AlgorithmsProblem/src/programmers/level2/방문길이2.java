package programmers.level2;

public class 방문길이2 {
    static class Solution {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        public int solution(String dirs) {
            int answer = 0;
            String[] ss = dirs.split("");
            int[][] map = new int[10][10];

            for (int i = 0; i < ss.length; i++) {
                int nx = 5;
                int ny = 5;
                int tmpX, tmpY;
                if (ss[i].equals("U")) {
                    tmpX = nx + dx[0];
                    tmpY = ny + dy[0];
                }
                else if (ss[i].equals("D")) {
                    tmpX = nx + dx[1];
                    tmpY = ny + dy[1];
                }
                else if (ss[i].equals("R")) {
                    tmpX = nx + dx[2];
                    tmpY = ny + dy[2];
                }
                else {
                    tmpX = nx + dx[3];
                    tmpY = ny + dy[3];
                }

                if (tmpX >= 0 && tmpY >= 0 && tmpX < 10 && tmpY < 10) {
                    nx = tmpX;
                    ny = tmpY;
                }

                if (map[nx][ny] == 0) {
                    answer++;
                    map[nx][ny] = 1;
                }
            }
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            s.solution("ULURRDLLU"	);
        }
    }
}
