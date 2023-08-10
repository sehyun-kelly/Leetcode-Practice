/** My Solution - 100%, 7.37% */
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
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
	      int sum = 0;
        return getPathSum(root, sum, targetSum);
    }

    public boolean getPathSum(TreeNode root, int sum, int targetSum){
        if(root == null) return false;

        sum = sum + root.val;

        if(root.left == null && root.right == null && sum == targetSum){
            return true;
        }

        return getPathSum(root.left, sum, targetSum) || getPathSum(root.right, sum, targetSum);
    }
}
