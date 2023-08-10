/** My Solution - 100%, 97.25% */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        return preOrder(root, result);
    }

    public List<Integer> preOrder(TreeNode root, List<Integer> result) {
        if(root == null){
            return result;
        }

        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);

        return result;
    }
}
