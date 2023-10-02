/** 93.21%, 6.84% */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        boolean[] visited = new boolean[len];
        Arrays.fill(visited, false);

        List<Integer> perms = new ArrayList<>();
        List<List<Integer>> allPerms = new ArrayList<>();

        getPerms(nums, perms, visited, allPerms);

        return allPerms;
    }

    public void getPerms(int[] nums, List<Integer> perms, boolean[] visited, List<List<Integer>> allPerms) {
        if(perms.size() == nums.length) {
            allPerms.add(new ArrayList<>(perms));
        }

        for(int i = 0; i < nums.length; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                perms.add(nums[i]);
                getPerms(nums, perms, visited, allPerms);
                visited[i] = false;
                perms.remove(perms.size() - 1);
            }
        }
    }
}