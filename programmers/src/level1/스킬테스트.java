package level1;

public class 스킬테스트 {

    class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 0, 12}};
            int xlp = 0;
            int ylp = 3;
            int xrp = 2;
            int yrp = 3;

            // 00 01 02
            // 10 11 12
            // 20 21 22
            // 30 31 32

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 1) {
                    answer += "L";
                    xlp = 0;
                    ylp = 0;
                }

                else if (numbers[i] == 4) {
                    answer += "L";
                    xlp = 0;
                    ylp = 1;
                }

                else if (numbers[i] == 7) {
                    answer += "L";
                    xlp = 0;
                    ylp = 2;
                }

                else if (numbers[i] == 3) {
                    answer += "R";
                    xrp = 2;
                    yrp = 0;
                }

                else if (numbers[i] == 6) {
                    answer += "R";
                    xrp = 2;
                    yrp = 1;
                }

                else if (numbers[i] == 9) {
                    answer += "R";
                    xrp = 2;
                    yrp = 2;
                }

                // 2일때
                else if (numbers[i] == 2) {
                    double l = Math.sqrt(Math.pow((1 - xlp), (0 - ylp)));
                    double r = Math.sqrt(Math.pow((1 - xrp), (0 - yrp)));

                    if (l > r || (l == r && hand.equals("left"))) {
                        answer += "L";
                        xlp = 1;
                        ylp = 0;
                    }

                    else if (l < r || (l == r && hand.equals("right"))) {
                        answer += "R";
                        xrp = 1;
                        yrp = 0;
                    }
                }


                // 5일때
                else if (numbers[i] == 5) {
                    double l = Math.sqrt(Math.pow((1 - xlp), (1 - ylp)));
                    double r = Math.sqrt(Math.pow((1 - xrp), (1 - yrp)));

                    if (l > r || (l == r && hand.equals("left"))) {
                        answer += "L";
                        xlp = 1;
                        ylp = 1;
                    }

                    else if (l < r || (l == r && hand.equals("right"))) {
                        answer += "R";
                        xrp = 1;
                        yrp = 1;
                    }
                }

                // 8일때
                else if (numbers[i] == 8) {
                    double l = Math.sqrt(Math.pow((1 - xlp), (2 - ylp)));
                    double r = Math.sqrt(Math.pow((1 - xrp), (2 - yrp)));

                    if (l > r || (l == r && hand.equals("left"))) {
                        answer += "L";
                        xlp = 1;
                        ylp = 2;
                    }

                    else if (l < r || (l == r && hand.equals("right"))) {
                        answer += "R";
                        xrp = 1;
                        yrp = 2;
                    }
                }

                // 0일때
                else if (numbers[i] == 0) {
                    double l = Math.sqrt(Math.pow((1 - xlp), (3 - ylp)));
                    double r = Math.sqrt(Math.pow((1 - xrp), (3 - yrp)));

                    if (l > r || (l == r && hand.equals("left"))) {
                        answer += "L";
                        xlp = 1;
                        ylp = 3;
                    }

                    else if (l < r || (l == r && hand.equals("right"))) {
                        answer += "R";
                        xrp = 1;
                        yrp = 3;
                    }
                }
            }

            return answer;
        }
    }
}
