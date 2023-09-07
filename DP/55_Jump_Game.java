/** Recursion -  14.87%, 82.24% */
class Solution {
    public boolean canJump(int[] nums) {
        boolean[] visited = new boolean[nums.length];
    
        return maxJump(nums, 0, visited);
    }

    public boolean maxJump(int[] nums, int curr, boolean[] visited) {
        if(curr >= nums.length - 1) return true;
        if(visited[curr]) return false;

        int maxReach = nums[curr];
        if(maxReach >= nums.length - 1) return true;
        if(maxReach == 0) return false;

        visited[curr] = true;

        boolean isFinished = false;

        for(int i = maxReach; i >= 1; i--) {
            isFinished = (isFinished || maxJump(nums, curr + i, visited));
        }

        return isFinished;
    }
}

/** Top-down - 80.41%, 82.24% */
class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] reachable = new boolean[len];
        reachable[len - 1] = true;

        int ptr = len - 2;
        int closestT = len - 1;

        while(ptr >= 0) {
            int maxJump = nums[ptr];
            int diff = closestT - ptr;

            if(maxJump >= diff) {
                reachable[ptr] = true;
                closestT = ptr;
            }

            ptr--;
        }
        
        return reachable[0];
    }
}