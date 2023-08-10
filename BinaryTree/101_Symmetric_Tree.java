/** My solution - 12.39%, 52.86% */
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        leftFirst(root.left, left);
        rightFirst(root.right, right);

        return left.equals(right);

    }

    public ArrayList<Integer> leftFirst(TreeNode root, ArrayList<Integer> left){
        if(root == null){
            left.add(null);
            return left;
        }

        left.add(root.val);
        leftFirst(root.left, left);
        leftFirst(root.right, left);

        return left;
    }

    public ArrayList<Integer> rightFirst(TreeNode root, ArrayList<Integer> right){
        if(root == null){
            right.add(null);
            return right;
        }

        right.add(root.val);
        rightFirst(root.right, right);
        rightFirst(root.left, right);

        return right;
    }
}

/** NOT my solution - 100%, 85% */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}
