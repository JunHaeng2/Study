package programmers.level2;

import java.util.Stack;

public class 스킬트리 {
    static class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;
            Stack<Character> st = new Stack<>();
            for (int i = skill.length() - 1; i >= 0; i--) {
                st.add(skill.charAt(i));
            }

            Stack<Character> helper = new Stack<>();
            for (int i = 0; i < skill_trees.length; i++) {
                helper = st;
                for (int j = 0; j < skill_trees[i].length(); j++) {
                    System.out.print(skill_trees[i].charAt(j) + " ");
                    System.out.print(helper.peek() + " ");
                    System.out.print(helper.size());
                    System.out.println();
                    if (skill_trees[i].charAt(j) == helper.peek()) helper.pop();
                    if (helper.size() == 0) {
                        answer += 1;
                        break;
                    }
                }
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            t.solution("CBD", new String[]{"CBADF"});
        }
    }
}
