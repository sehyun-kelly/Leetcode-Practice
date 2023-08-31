/** 100%, 80.67% */
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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        return getHeight(root) == -1 ? false : true;
    }

    public int getHeight(TreeNode node){
        if(node == null) return 0;

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        if(Math.abs(left - right) > 1) return -1;
        if(left == -1 || right == -1) return -1;

        return Math.max(left, right) + 1;
    }
}