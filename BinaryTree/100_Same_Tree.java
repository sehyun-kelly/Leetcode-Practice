/** My Solution - 100%, 9.47% */

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        ArrayList<Integer> pVisited = new ArrayList<>();
        ArrayList<Integer> qVisited = new ArrayList<>();

        return dfs(p, pVisited).equals(dfs(q, qVisited));
    }

    public ArrayList<Integer> dfs(TreeNode node, ArrayList<Integer> visited){
        if(node == null){
            visited.add(null);
            return visited;
        }

        visited.add(node.val);

        if(node.left != null) dfs(node.left, visited);
        else visited.add(null);

        if(node.right != null) dfs(node.right, visited);      
        else visited.add(null);

        return visited;
    }
}


/** From Solution */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
