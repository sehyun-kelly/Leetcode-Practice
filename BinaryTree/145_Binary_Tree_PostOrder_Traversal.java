/** 100%, 96.19% */
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
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> postOrderList = new ArrayList<>();

      return postOrder(root, postOrderList);
    }

    public List<Integer> postOrder(TreeNode node, List<Integer> postOrderList) {
      if(node == null) return postOrderList;

      if(node.left != null) postOrder(node.left, postOrderList);
      if(node.right != null) postOrder(node.right, postOrderList);
      postOrderList.add(node.val);

      return postOrderList;
    }
}