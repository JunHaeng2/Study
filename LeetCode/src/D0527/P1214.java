package D0527;

public class P1214 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
//    class Solution {
//        public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
//            List<Integer> arr1 = new ArrayList<>();
//            List<Integer> arr2 = new ArrayList<>();
//            dfs(root1, arr1);
//            dfs(root2, arr2);
//
//            for (int i = 0; i< arr1.size(); i++) {
//                for (int j = 0; j < arr2.size(); j++) {
//                    if ((arr1.get(i) + arr2.get(j)) == target) return true;
//                }
//            }
//
//            return false;
//        }
//
//        private void dfs(TreeNode root, List<Integer> arr) {
//            if (root == null) return;
//
//            arr.add(root.val);
//            dfs(root.left, arr);
//            dfs(root.right, arr);
//        }
//    }
}
