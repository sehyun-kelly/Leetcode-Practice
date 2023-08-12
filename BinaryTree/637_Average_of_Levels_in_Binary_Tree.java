/** My Solution - 97.71%, 17.67% */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            long sum = 0;

            for(int i = 0; i < n; i++){
                TreeNode temp = queue.poll();
                sum += temp.val;

                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }

            averages.add((double)sum / n);
        }

        return averages;
    }
}
