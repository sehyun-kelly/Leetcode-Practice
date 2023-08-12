/** My Solution - 34.39%, 91.82% */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        inOrder(root, tree);

        int n = tree.size();
        int min = tree.get(n - 1) - tree.get(0);

        for(int i = 0; i < n - 1; i++){
            int diff = Math.abs(tree.get(i + 1) - tree.get(i));
            if(diff < min) min = diff;
        }
        
        return min;
    }

    public List<Integer> inOrder(TreeNode node, List<Integer> tree){
        if(node == null) return tree;

        inOrder(node.left, tree);
        tree.add(node.val);
        inOrder(node.right, tree);

        return tree;
    }
}
